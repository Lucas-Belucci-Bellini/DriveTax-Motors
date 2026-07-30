# DriveTax-Motors

This repository now includes a Vite frontend in the `frontend/` folder that can be deployed to Vercel.

## Frontend deployment

- Navigate to `frontend/`
- Install dependencies: `npm install`
- Run locally: `npm run dev`
- Build for production: `npm run build`

> In Vercel, set the project root to `frontend` and use `npm install && npm run build` as the build command.

A visão do **DriveTax-Motors** de entregar transparência total para o comprador de carros — desde o valor real sem impostos até o custo individual de manutenção — resolve uma dor gigantesca e muito real no mercado automotivo.

A sua lógica de dividir o sistema em etapas de processamento está certíssima. Você descreveu conceitualmente um **Pipeline de Dados (Data Pipeline)** com uma arquitetura orientada a eventos ou microsserviços.

No entanto, como um engenheiro de software, preciso te dar um direcionamento prático: **nós não criamos um número fixo de "960 calculadoras" na prática.** Manter 960 arquivos, serviços ou servidores diferentes seria um pesadelo de infraestrutura e manutenção.

Em vez de pensar em "960 calculadoras separadas", pense em **4 Motores (Engines)** que escalam automaticamente, multiplicando seus *workers* (trabalhadores) dependendo do volume de dados. Aqui está como a sua ideia se traduz em uma arquitetura de software moderna:

1. **Motor de Ingestão (Bots):**
**O que faz:** Seus scrapers e APIs buscam dados brutos (tabela FIPE, alíquotas de ICMS/IPI estaduais, catálogos de peças, manuais de revisão).


2. **Motor de Cálculo (Suas primeiras 480 calculadoras):**
**O que faz:** É um serviço que recebe os dados dos bots e roda dezenas de fórmulas matemáticas ao mesmo tempo. Ele calcula a desoneração de impostos (ex: descontos para PCD ou frotistas), depreciação e custo base. Se houver muitos acessos, o servidor "clona" esse motor automaticamente para dar conta do recado (escala horizontal).


3. **Motor de Auditoria (Suas 240 calculadoras de verificação):**
**O que faz:** Uma camada de validação e conciliação (Testes Automatizados e Sanity Checks). Esse serviço pega o resultado do Motor de Cálculo e aplica engenharia reversa para ver se a conta fecha. Exemplo: *Se o carro custa X e a peça Y, a soma dos impostos bate com a legislação atual?* Se não bater, ele acusa o erro e impede que o cliente veja dados errados.


4. **Motor de Apresentação (Suas últimas 240 calculadoras):**
**O que faz:** É a API de entrega (Front-end/Relatórios). Ele não faz contas complexas, apenas compila os dados validados em um "Raio-X" customizado para o cliente, mostrando as métricas de forma visual e acionável.


### Como organizar isso no seu repositório do GitHub

Para que o DriveTax-Motors saia do papel com essa robustez, você precisará organizar o código de forma modular, usando filas de mensagens (Message Brokers como RabbitMQ, Kafka ou AWS SQS) para passar os dados de um motor para o outro.

Você pode estruturar seu repositório principal com as seguintes pastas (módulos):

* `/scrapers` (Os bots coletores)
* `/core_engine` (O motor de cálculo pesado)
* `/validator` (O sistema de auditoria)
* `/api` (O entregador de resultados finais)

Dessa forma, se amanhã o governo mudar a regra de um imposto, você altera o código apenas dentro do `/core_engine` e do `/validator`, sem quebrar os bots ou a tela do cliente.

Para modelar essa primeira calculadora, precisamos encarar um dos maiores desafios do sistema tributário brasileiro: a diferença entre impostos calculados "por dentro" e "por fora".

O **IPI** (federal) é um imposto cobrado "por fora", ou seja, ele é somado ao valor de fábrica do carro. Já o **ICMS** (estadual) é cobrado "por dentro", o que significa que ele compõe a sua própria base de cálculo no preço final.

Para extrair o valor real do carro (Preço de Fábrica), precisamos aplicar a engenharia reversa no Preço Público Sugerido (PPS).

## 1. A Matemática (O Modelo)

Se o preço final do carro possui ambos os impostos embutidos, a equação que rege o preço final é:

$$P_{final} = \frac{P_{fab} \times (1 + t_{ipi})}{1 - t_{icms}}$$

Onde:

* $P_{final}$ = Preço final ao consumidor (tabela)
* $P_{fab}$ = Preço real de fábrica (sem impostos)
* $t_{ipi}$ = Alíquota do IPI em decimal (ex: 11% = 0.11)
* $t_{icms}$ = Alíquota do ICMS em decimal (ex: 12% = 0.12)

Isolando o Preço de Fábrica ($P_{fab}$), chegamos à fórmula que a sua calculadora vai usar:

$$P_{fab} = \frac{P_{final} \times (1 - t_{icms})}{1 + t_{ipi}}$$

---

## 2. A Programação (Motor de Cálculo)

Para pipelines de dados como o DriveTax-Motors, **Python** é a escolha ideal pela velocidade de processamento e facilidade de testar matematicamente.

Aqui está como você programa essa primeira calculadora. Ela recebe os dados brutos (que vieram dos seus bots) e cospe os valores detalhados:

```python
class CalculadoraDesoneracao:
    def __init__(self, preco_final: float, taxa_ipi_perc: float, taxa_icms_perc: float):
        """
        Inicializa a calculadora convertendo as porcentagens em decimais.
        """
        self.preco_final = preco_final
        self.taxa_ipi = taxa_ipi_perc / 100
        self.taxa_icms = taxa_icms_perc / 100

    def extrair_preco_real(self) -> dict:
        """
        Calcula o preço de fábrica e o valor exato pago em cada imposto.
        Retorna um dicionário (JSON) pronto para ser enviado para a próxima etapa.
        """
        # 1. Aplica a fórmula matemática
        preco_fabrica = (self.preco_final * (1 - self.taxa_icms)) / (1 + self.taxa_ipi)
        
        # 2. Descobre o valor monetário de cada imposto
        valor_ipi = preco_fabrica * self.taxa_ipi
        
        # O ICMS incide sobre o preço de fábrica + IPI
        base_icms = preco_fabrica + valor_ipi
        valor_icms = base_icms * self.taxa_icms

        # 3. Retorna os dados mastigados
        return {
            "preco_tabela": round(self.preco_final, 2),
            "preco_real_fabrica": round(preco_fabrica, 2),
            "impostos": {
                "valor_ipi": round(valor_ipi, 2),
                "valor_icms": round(valor_icms, 2),
                "total_impostos": round(valor_ipi + valor_icms, 2)
            }
        }

# --- Simulando o uso com um carro de R$ 120.000 ---
# Considerando IPI de 11% e ICMS de 12% (varia por estado/motor)
calculadora = CalculadoraDesoneracao(preco_final=120000.00, taxa_ipi_perc=11.0, taxa_icms_perc=12.0)
resultado = calculadora.extrair_preco_real()

print(resultado)

```

---

## 3. Como o seu "Motor de Auditoria" verifica isso?

Você mencionou que 240 calculadoras vão "verificar se a conta está certa". Na programação, chamamos isso de **Testes Unitários**.

O seu Motor de Auditoria pegaria o resultado da calculadora acima e faria a conta de trás para frente para garantir que o consumidor não veja um dado corrompido:

```python
def motor_de_auditoria(dados_calculados: dict):
    # Pega os valores que a calculadora gerou
    p_fabrica = dados_calculados["preco_real_fabrica"]
    v_ipi = dados_calculados["impostos"]["valor_ipi"]
    v_icms = dados_calculados["impostos"]["valor_icms"]
    
    # Faz a prova real: A soma de tudo TEM que ser igual ao preço de tabela
    preco_reconstruido = p_fabrica + v_ipi + v_icms
    preco_tabela = dados_calculados["preco_tabela"]
    
    # Se a diferença for maior que 1 centavo (erro de arredondamento), ele barra.
    if abs(preco_reconstruido - preco_tabela) > 0.01:
        raise ValueError(f"ERRO DE CÁLCULO! Soma: {preco_reconstruido} | Tabela: {preco_tabela}")
    
    print("Auditoria passou: O cálculo está perfeito e os centavos batem.")
    return True

# Rodando o teste
motor_de_auditoria(resultado)

```

Essa lógica resolve o núcleo do seu produto. Com esse esqueleto, você pode adicionar facilmente IPVA, custo do seguro e IPVA para formar o custo total de propriedade (TCO) que você quer entregar.

https://github.com/Lucas-Belucci-Bellini/DriveTax-Motors.git a ideia é criar 960 calculadoras que cada uma vai calcular uma coisa 480 vão calcular dados que os boots pegaram e esses dados vão ser avaliados por 240 caluculadoras que vão verificar se a conta está certa e bater com os dados e verifficar se os dados estão certos feito isso as outras 240 calculadoras vão entregar todos os resulados de que o cliente pode quer ou não saber, desde o valor real do carro sem imposto até o custo de manutenção e cada preço de peça do carro 

Para integrar o custo de manutenção e peças, nós precisamos dar um passo além do preço de compra e entrar no cálculo de **TCO (Total Cost of Ownership - Custo Total de Propriedade)**.

No design de software do DriveTax-Motors, a regra de ouro é a **modularidade**. Você não deve colocar essa matemática dentro da mesma calculadora que remove impostos. Se fizermos isso, o código vira um "Frankenstein" difícil de manter.

Em vez disso, criaremos uma segunda "calculadora" especializada em manutenção, e um **Agregador** que junta os resultados de ambas.

## 1. O Formato dos Dados (O que os Bots precisam capturar)

Antes de calcular, precisamos definir o "contrato de dados". Seus bots (Motor de Ingestão) precisarão varrer os sites das montadoras e catálogos de peças e entregar um pacote (JSON) estruturado assim:

| Categoria | Estrutura de Dados (Exemplo) |
| --- | --- |
| **Revisões Programadas** | Lista com KM e Preço (ex: 10.000km = R$ 650, 20.000km = R$ 890). |
| **Cesta de Peças (Desgaste)** | Lista de peças comuns, preço e quantidade estimada para 3 anos (ex: 4 pneus, 1 pastilha de freio). |

---

## 2. A Programação (Motor de Manutenção)

Aqui está a modelagem da calculadora que processa esses dados. O grande diferencial comercial do seu sistema será mostrar ao cliente o **custo por quilômetro rodado**, projetando o gasto para um tempo médio de uso (ex: 3 anos rodando 15.000 km/ano).

```python
class CalculadoraManutencao:
    def __init__(self, revisoes: list, pecas: list, km_por_ano: int = 15000, anos_uso: int = 3):
        self.revisoes = revisoes
        self.pecas = pecas
        # Define até que quilometragem o carro será usado com esse dono
        self.km_total_projetado = km_por_ano * anos_uso 

    def projetar_custos(self) -> dict:
        """
        Calcula o custo de revisões, troca de peças de desgaste e o custo por KM.
        """
        # 1. Soma apenas as revisões que acontecem dentro da quilometragem projetada
        custo_revisoes = sum(
            rev["preco"] for rev in self.revisoes if rev["km"] <= self.km_total_projetado
        )
        
        # 2. Soma o custo da cesta de peças de desgaste natural
        custo_pecas = sum(
            peca["preco"] * peca["quantidade"] for peca in self.pecas
        )
        
        custo_total = custo_revisoes + custo_pecas
        custo_por_km = custo_total / self.km_total_projetado

        return {
            "projecao_anos": 3,
            "km_total_projetado": self.km_total_projetado,
            "gastos": {
                "total_revisoes": round(custo_revisoes, 2),
                "total_pecas": round(custo_pecas, 2),
                "custo_manutencao_total": round(custo_total, 2)
            },
            "indicadores": {
                "custo_manutencao_por_km": round(custo_por_km, 3)
            }
        }

# --- Simulando os dados extraídos pelos seus Bots ---
dados_revisoes = [
    {"km": 10000, "preco": 650.00},
    {"km": 20000, "preco": 890.00},
    {"km": 30000, "preco": 700.00},
    {"km": 40000, "preco": 1200.00}, # Ex: Troca de correia dentada aos 40k
    {"km": 50000, "preco": 650.00}
]

dados_pecas = [
    {"item": "Pneu (jogo)", "preco": 2400.00, "quantidade": 1},
    {"item": "Pastilha de freio", "preco": 450.00, "quantidade": 2},
    {"item": "Palheta limpador", "preco": 120.00, "quantidade": 3}
]

# Rodando a calculadora
calc_manutencao = CalculadoraManutencao(revisoes=dados_revisoes, pecas=dados_pecas)
resultado_manutencao = calc_manutencao.projetar_custos()

```

---

## 3. O Agregador (Unindo Tudo)

Agora entra o conceito de **Pipeline**. Você tem a `CalculadoraDesoneracao` (que fizemos antes) e a `CalculadoraManutencao`. O sistema precisa de um maestro para reger as duas e entregar o resultado completo que as suas "últimas 240 calculadoras" (a API) vão exibir para o cliente.

```python
def gerar_raio_x_do_veiculo(dados_brutos: dict) -> dict:
    # 1. Roda a primeira calculadora (Impostos)
    calc_impostos = CalculadoraDesoneracao(
        preco_final=dados_brutos["preco_tabela"], 
        taxa_ipi_perc=dados_brutos["ipi"], 
        taxa_icms_perc=dados_brutos["icms"]
    )
    resultado_preco = calc_impostos.extrair_preco_real()
    
    # 2. Roda a segunda calculadora (Manutenção)
    calc_manutencao = CalculadoraManutencao(
        revisoes=dados_brutos["revisoes"], 
        pecas=dados_brutos["pecas"]
    )
    resultado_manutencao = calc_manutencao.projetar_custos()
    
    # 3. Empacota tudo para o Front-end
    return {
        "modelo": dados_brutos["modelo"],
        "aquisicao": resultado_preco,
        "pos_venda": resultado_manutencao,
        # Aqui você pode cruzar os dados!
        "custo_real_3_anos": round(resultado_preco["preco_tabela"] + resultado_manutencao["gastos"]["custo_manutencao_total"], 2)
    }

```

Ao estruturar dessa forma, se você quiser criar uma nova calculadora amanhã (ex: `CalculadoraDepreciacao` ou `CalculadoraSeguro`), basta criar uma nova classe e plugar dentro do agregador. O sistema escala infinitamente sem quebrar.

A construção desses bots (o seu Motor de Ingestão) é uma das partes mais desafiadoras e importantes do projeto. Sites de montadoras e catálogos de peças costumam ser dinâmicos: você precisa selecionar o modelo, o ano e a versão em menus (dropdowns) para que o site carregue a tabela de revisões.

Por causa disso, bibliotecas simples como `requests` ou `BeautifulSoup` não vão funcionar bem, pois elas não executam o JavaScript da página. Para o DriveTax-Motors, a ferramenta definitiva em Python hoje é o **Playwright**.

Ele abre um navegador real (ou invisível), clica nos menus como um humano faria, espera a tabela carregar e extrai os dados.

Aqui está o fluxo visual de como esse bot vai operar dentro da sua arquitetura:

---

## Como programar o seu primeiro Bot com Playwright

Primeiro, você precisará instalar a biblioteca e os navegadores rodando estes comandos no seu terminal:

```bash
pip install playwright
playwright install

```

Abaixo está o modelo de um bot projetado para entrar em um site de montadora, interagir com a página e extrair uma tabela de revisões.

```python
import asyncio
from playwright.async_api import async_playwright
import json

async def raspar_revisoes_carro(url: str, modelo: str):
    # Inicia o Playwright
    async with async_playwright() as p:
        # Abre o navegador (headless=False permite ver o bot trabalhando)
        browser = await p.chromium.launch(headless=False)
        page = await browser.new_page()

        print(f"[{modelo}] Acessando site...")
        await page.goto(url)

        # 1. Simula a interação humana (Exemplo: selecionando o carro num menu)
        # O bot procura um elemento na tela (ex: um botão escrito "Selecione o Modelo")
        # e clica nele.
        try:
            await page.click("button#selecionar-modelo")
            await page.select_option("select#dropdown-carros", value=modelo)
            await page.click("button#buscar-revisoes")
            
            # 2. Espera a tabela aparecer na tela para não extrair HTML vazio
            await page.wait_for_selector("table.tabela-revisoes")
        except Exception as e:
            print(f"Erro ao navegar na página: {e}")
            await browser.close()
            return None

        # 3. Extrai os dados
        # Vamos varrer todas as linhas (tr) dentro da tabela
        linhas = await page.locator("table.tabela-revisoes tbody tr").all()
        
        dados_revisoes = []
        
        for linha in linhas:
            # Pega o texto da coluna de KM e da coluna de Preço
            colunas = await linha.locator("td").all_inner_texts()
            
            if len(colunas) >= 2:
                km_texto = colunas[0].strip() # Ex: "10.000 km"
                preco_texto = colunas[1].strip() # Ex: "R$ 650,00"
                
                # Limpa os textos para virarem números (Int e Float)
                km_limpo = int(''.join(filter(str.isdigit, km_texto)))
                preco_limpo = float(preco_texto.replace("R$", "").replace(".", "").replace(",", ".").strip())
                
                dados_revisoes.append({
                    "km": km_limpo,
                    "preco": preco_limpo
                })

        print(f"[{modelo}] Extração concluída com sucesso!")
        await browser.close()
        
        # 4. Formata o pacote de dados final
        return {
            "modelo": modelo,
            "origem": url,
            "revisoes": dados_revisoes
        }

# --- Executando o Bot ---
async def main():
    # URL fictícia para o exemplo
    url_montadora = "https://www.site-da-montadora-exemplo.com.br/revisoes"
    
    dados = await raspar_revisoes_carro(url_montadora, "modelo_xyz")
    
    # Imprime o JSON pronto para ser enviado para a Calculadora
    print(json.dumps(dados, indent=4, ensure_ascii=False))

# Roda a função principal
if __name__ == "__main__":
    asyncio.run(main())

```

### O Segredo para não ser bloqueado

Se você colocar esse script para rodar mil vezes seguidas, os sites das montadoras vão identificar que é um robô e bloquear o seu IP (o famoso Erro 403 ou testes de Captcha).

Para construir um Motor de Ingestão de nível comercial para o DriveTax-Motors, você deve implementar três defesas no seu bot:

1. **Rotação de Proxies:** Usar serviços de proxy para que cada acesso pareça vir de um computador diferente (e de um estado diferente do Brasil).
2. **Randomização de Tempo:** Nunca clique ou mude de página exatamente no mesmo milissegundo. Adicione `await page.wait_for_timeout(2000)` (pausas aleatórias de 2 a 5 segundos) entre as ações.
3. **Agendamento Inteligente (Cron Jobs):** Preços de peças e revisões não mudam a cada hora. Mude a frequência dos seus bots para raspar os dados apenas uma vez por semana, de madrugada (quando os sites têm menos tráfego real).

Para um sistema que recebe milhares de atualizações de bots diariamente (escrita) e precisa alimentar calculadoras financeiras em tempo real (leitura), você não pode usar apenas um tipo de banco de dados.

A arquitetura padrão da indústria para esse cenário é o modelo **Híbrido (Relacional + Cache)**.

## A Escolha das Tecnologias

1. **PostgreSQL (Banco Principal/Relacional):** É a espinha dorsal. Ele é perfeito para garantir que os dados financeiros estejam corretos (sem dados duplicados ou órfãos). Além disso, o PostgreSQL possui um campo nativo chamado `JSONB`, que permite salvar os dados "sujos" dos bots antes da limpeza.
2. **Redis (Banco em Memória/Cache):** É o segredo para o sistema não ficar lento. Ele não salva dados no disco rígido, mas sim na memória RAM. Quando o cliente final acessa a plataforma, a API busca os preços no Redis em milissegundos, sem encostar no PostgreSQL.

---

## Como Modelar o Banco de Dados (Esquema)

Seus dados precisam ser separados em "entidades" lógicas. Se você colocar tudo em uma tabela só, a busca por uma peça de desgaste vai varrer milhões de linhas desnecessariamente.

Aqui está o mapa relacional (ER) projetado para o DriveTax-Motors:

> **Ponto Crítico:** Note a coluna `Data_Captura` na tabela de preços. Você nunca apaga um preço antigo. Você insere um novo e marca o mais recente como `ativo`. Isso permite que você mostre gráficos de flutuação de preço do carro ao longo dos meses.

---

## Táticas para Evitar Lentidão (Performance)

O banco de dados pode ser o melhor do mundo, mas se o código não conversar bem com ele, o sistema vai engasgar. Siga estas 3 regras no seu backend:

### 1. Inserção em Lote (Batch Insert)

Os seus bots não devem abrir uma conexão com o banco a cada carro pesquisado. Isso derruba qualquer servidor.
**O errado:** O bot acha 100 preços e manda `INSERT` 100 vezes.
**O certo:** O bot junta os 100 preços em uma lista (JSON), manda para o Motor de Cálculo, e ele faz um único `INSERT` com os 100 registros de uma vez.

### 2. Índices (Indexes) nas Buscas

Se o seu usuário costuma buscar carros por "Marca" e "Modelo", você precisa avisar o PostgreSQL para criar um índice (um atalho) para essas colunas.
No SQL, basta um comando simples:
`CREATE INDEX idx_marca_modelo ON Veiculo (marca, modelo);`
Isso transforma uma busca que demoraria 5 segundos em algo de 0.05 segundos.

### 3. A Regra do Cache (O Papel do Redis)

Quando o Motor de Auditoria (as 240 calculadoras que verificam os dados) aprova que a conta fechou, ele salva o resultado final (ex: Preço do Carro + TCO 3 Anos) no **Redis**.

O Redis guarda essa informação com uma chave simples, tipo: `resultado:vw_polo_highline_2024`.
Quando o cliente clicar no aplicativo para ver o carro, o sistema nem olha para o PostgreSQL — ele apenas "pesca" o JSON pronto no Redis instantaneamente.

O uso de um **Message Broker** (como RabbitMQ ou Kafka) é o coração de qualquer pipeline de dados profissional. Sem ele, se seus bots enviarem 5.000 preços de carros ao mesmo tempo, seus servidores de cálculo vão engasgar e o banco de dados pode cair (o famoso *gargalo*).

A fila atua como um **amortecedor (buffer)**. Os bots "despejam" os dados na fila na velocidade máxima deles. Do outro lado, as suas calculadoras "bebem" esses dados da fila no próprio ritmo, processam a matemática e salvam no banco de dados.

Para o caso do **DriveTax-Motors**, onde você tem tarefas específicas (processar cálculo X, validar dado Y), o **RabbitMQ** é a escolha ideal. Ele é mais simples de configurar que o Kafka e perfeito para roteamento de tarefas.

## A Arquitetura de Filas do DriveTax-Motors

Aqui está como o fluxo dos dados acontece em tempo real:

---

## Como programar isso em Python

Para conectar seus scripts, usamos a biblioteca `pika`, que é o padrão do Python para RabbitMQ.

### 1. O Bot (O "Publicador" / Producer)

O bot vai fazer o trabalho dele de acessar o site, extrair o preço e, em vez de tentar salvar no banco direto, ele envia a "carta" para o RabbitMQ e vai embora.

```python
import pika
import json

def enviar_para_fila(dados_carro):
    # Conecta no servidor do RabbitMQ
    conexao = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
    canal = conexao.channel()

    # Cria a fila (se ela não existir, ele cria)
    canal.queue_declare(queue='fila_dados_brutos')

    # Transforma o dicionário Python em texto (JSON) para enviar
    mensagem = json.dumps(dados_carro)

    # Publica a mensagem na fila
    canal.basic_publish(
        exchange='',
        routing_key='fila_dados_brutos',
        body=mensagem
    )
    
    print(f"✅ Enviado para a fila: {dados_carro['modelo']}")
    conexao.close()

# Simulação do Bot
meu_dado = {"modelo": "VW Polo", "preco_tabela": 120000}
enviar_para_fila(meu_dado)

```

### 2. A Calculadora (O "Consumidor" / Consumer)

A calculadora fica rodando 24 horas por dia em segundo plano, apenas escutando a fila. Assim que um dado cai lá, ela puxa, calcula e salva no banco. Se você precisar de mais velocidade, basta rodar 10 cópias desse mesmo arquivo Python (isso é a sua ideia inicial de ter dezenas de calculadoras rodando juntas).

```python
import pika
import json

def ao_receber_mensagem(ch, method, properties, body):
    # Recebe a mensagem e converte de volta para dicionário
    dados = json.loads(body)
    print(f"📥 Recebido da fila: {dados['modelo']}. Iniciando cálculo...")
    
    # -> AQUI VOCÊ RODA A SUA CLASSE CalculadoraDesoneracao <-
    
    # Se o cálculo der certo, você "avisa" o RabbitMQ para apagar a mensagem da fila
    ch.basic_ack(delivery_tag=method.delivery_tag)
    print("💾 Cálculo concluído e salvo no banco. Mensagem apagada da fila.\n")

def escutar_fila():
    conexao = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
    canal = conexao.channel()

    canal.queue_declare(queue='fila_dados_brutos')

    # Avisa ao RabbitMQ que essa função (ao_receber_mensagem) vai processar os dados
    canal.basic_consume(
        queue='fila_dados_brutos',
        on_message_callback=ao_receber_mensagem,
        auto_ack=False # MUITO IMPORTANTE: Garante que a mensagem só seja apagada se o cálculo não der erro
    )

    print("🎧 Aguardando dados dos bots... Para sair pressione CTRL+C")
    canal.start_consuming()

# Inicia a escuta
escutar_fila()

```

> **A grande sacada (auto_ack=False):** Se a sua calculadora estiver processando o "VW Polo" e o servidor cair do nada, a conta não foi finalizada. Como o RabbitMQ não recebeu o `basic_ack`, ele percebe a falha e devolve a mensagem do "VW Polo" para o início da fila. Quando o servidor voltar, a calculadora tenta de novo. **Você não perde nenhum dado.**

O **Docker** é a ferramenta definitiva para resolver aquele velho problema: *"na minha máquina funciona, mas no servidor não"*. Ele empacota o seu código, o banco de dados e as filas de mensagens em "caixas isoladas" chamadas **Contêineres**.

Para rodar todo o ecossistema do **DriveTax-Motors** ao mesmo tempo, nós usamos o **Docker Compose**. Ele é um arquivo de texto que age como um "maestro", dizendo quem deve ligar primeiro, quais são as senhas e como os contêineres conversam entre si.

Aqui está o passo a passo para "conteinerizar" a sua infraestrutura.

### Passo 1: Criar o arquivo `docker-compose.yml`

Na pasta raiz do seu repositório no GitHub, você vai criar um arquivo chamado `docker-compose.yml`. Ele vai conter a planta baixa do seu sistema:

```yaml
version: '3.8'

services:
  # 1. O Banco de Dados Principal
  postgres_db:
    image: postgres:15
    environment:
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: senha_segura_123
      POSTGRES_DB: drivetax
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data # Garante que os dados não sumam se o servidor reiniciar

  # 2. O Banco de Dados em Memória (Cache para as consultas do cliente)
  redis_cache:
    image: redis:7-alpine
    ports:
      - "6379:6379"

  # 3. O Message Broker (Fila)
  rabbitmq:
    image: rabbitmq:3-management
    ports:
      - "5672:5672"   # Porta onde os bots e as calculadoras se conectam
      - "15672:15672" # Porta do painel visual no navegador (para você ver as filas)
    environment:
      RABBITMQ_DEFAULT_USER: admin
      RABBITMQ_DEFAULT_PASS: senha_fila_123

  # 4. As suas 480 Calculadoras (O Motor Central)
  motor_calculo:
    build: ./core_engine # Aponta para a pasta onde está o código Python das calculadoras
    depends_on:
      - rabbitmq
      - postgres_db
    environment:
      - RABBITMQ_URL=amqp://admin:senha_fila_123@rabbitmq:5672/
      - DATABASE_URL=postgresql://admin:senha_segura_123@postgres_db:5432/drivetax
    deploy:
      replicas: 3 # O Docker vai criar 3 cópias exatas da sua calculadora para dividir o trabalho!

  # 5. O Bot de Ingestão (Scraper)
  bot_scraper:
    build: ./scrapers # Aponta para a pasta onde está o bot (Playwright)
    depends_on:
      - rabbitmq
    environment:
      - RABBITMQ_URL=amqp://admin:senha_fila_123@rabbitmq:5672/

volumes:
  postgres_data:

```

> **A Mágica da Rede Interna:** Repare que no `RABBITMQ_URL`, no lugar de colocar `localhost` ou um IP complexo, nós escrevemos `rabbitmq`. O Docker é inteligente o suficiente para criar uma rede interna onde os nomes dos serviços viram os endereços deles!

### Passo 2: O Arquivo `Dockerfile` (A receita do Python)

Dentro da pasta `/core_engine` (onde fica o código da sua calculadora) e da pasta `/scrapers`, você precisa colocar um arquivo chamado `Dockerfile` (sem extensão). Ele ensina o Docker a instalar o Python e rodar seu código.

**Exemplo do `Dockerfile` para a Calculadora:**

```dockerfile
# 1. Pega um "computador" Linux limpo com Python já instalado
FROM python:3.11-slim

# 2. Define a pasta de trabalho dentro do contêiner
WORKDIR /app

# 3. Copia o arquivo de dependências (requirements.txt) e instala (ex: pika, psycopg2)
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# 4. Copia todo o código da calculadora para dentro do contêiner
COPY . .

# 5. O comando para ligar a calculadora quando o servidor iniciar
CMD ["python", "main_calculadora.py"]

```

### Passo 3: Colocando tudo no ar!

Seja no seu computador para testes, ou em um servidor na nuvem (como **AWS EC2**, **DigitalOcean Droplets**, ou **Google Cloud Compute Engine**), você só precisa clonar o seu GitHub, instalar o Docker e rodar um único comando no terminal:

```bash
docker-compose up -d

```

O comando `-d` significa *detached*. O Docker vai baixar os bancos de dados, preparar o RabbitMQ, construir o ambiente do Python, ligar os seus bots e iniciar 3 cópias do seu motor de cálculo. Tudo isso rodará silenciosamente no servidor.

Se você acessar `http://IP_DO_SERVIDOR:15672` no seu navegador, você verá o painel de controle do RabbitMQ mostrando as filas trabalhando em tempo real!

---

### Como escalar de 3 para 240 calculadoras?

Se o seu sistema crescer e os bots começarem a enviar 100 mil carros por dia, você não precisa reescrever uma linha de código sequer. Você apenas vai no terminal do servidor e digita:

```bash
docker-compose up -d --scale motor_calculo=240

```

E o Docker, em segundos, multiplica a sua calculadora para dar conta da fila. Essa é a arquitetura que empresas globais usam para escalar infinitamente.

A construção da API é a cereja do bolo. É ela que vai servir como uma "ponte" entre o seu complexo sistema de retaguarda (bancos de dados, calculadoras, filas) e a tela do celular do seu cliente.

O **FastAPI** é atualmente o framework mais moderno em Python para isso. Ele é assíncrono (não trava enquanto espera o banco de dados responder) e — o melhor de tudo — cria a documentação da sua API automaticamente.

Aqui está o projeto de como construir essa API aplicando a **Regra do Cache** que definimos anteriormente: o sistema tenta ler do Redis primeiro (em milissegundos); se não achar, busca no PostgreSQL.

### 1. Instalando as Bibliotecas

No seu ambiente, você precisará do FastAPI, do servidor web (`uvicorn`) e do cliente do Redis:

```bash
pip install fastapi uvicorn redis

```

### 2. O Código da API (O Entregador de Dados)

Crie um arquivo chamado `main_api.py` dentro da sua pasta `/api`. O código abaixo mostra a criação de um "Endpoint" (uma URL de acesso) que o seu aplicativo vai chamar quando o usuário clicar em um carro.

```python
from fastapi import FastAPI, HTTPException
import redis.asyncio as redis
import json

# Inicializa a API
app = FastAPI(
    title="API DriveTax-Motors",
    description="Motor de entrega de dados financeiros automotivos",
    version="1.0.0"
)

# Conecta ao Redis (Se estiver no Docker, o endereço é "redis://redis_cache:6379")
cache = redis.from_url("redis://localhost:6379", decode_responses=True)

# Função simulada de busca no PostgreSQL (Aqui você usaria SQLAlchemy ou psycopg2)
async def buscar_no_postgresql(modelo_id: str):
    # Simula uma busca lenta no banco relacional
    banco_de_dados = {
        "vw_polo_highline_2024": {
            "modelo": "VW Polo Highline 2024",
            "preco_tabela": 120000.00,
            "preco_fabrica": 85000.00,
            "impostos": {"ipi": 9350.00, "icms": 11322.00},
            "manutencao_3_anos": 4500.00,
            "custo_por_km": 0.15
        }
    }
    return banco_de_dados.get(modelo_id)

# Cria a Rota de Busca do Carro
@app.get("/veiculos/{modelo_id}")
async def obter_raio_x_veiculo(modelo_id: str):
    """
    Retorna o Raio-X completo do veículo, priorizando o cache em memória (Redis).
    """
    # 1. TENTA NO CACHE (Redis) - Resposta em ~2 milissegundos
    dado_em_cache = await cache.get(f"resultado:{modelo_id}")
    
    if dado_em_cache:
        print("⚡ Retornando dados ultra-rápidos do Redis!")
        return json.loads(dado_em_cache)

    # 2. SE NÃO ESTIVER NO CACHE, BUSCA NO POSTGRESQL - Resposta em ~50-100 milissegundos
    dados_banco = await buscar_no_postgresql(modelo_id)
    
    if not dados_banco:
        raise HTTPException(status_code=404, detail="Veículo não encontrado em nossa base.")

    # 3. SALVA NO REDIS PARA O PRÓXIMO USUÁRIO 
    # (ex: expira em 86400 segundos = 24 horas)
    print("🐢 Buscou no PostgreSQL e salvou no Cache para a próxima vez.")
    await cache.set(f"resultado:{modelo_id}", json.dumps(dados_banco), ex=86400)

    return dados_banco

```

### 3. Rodando e Testando a API

Para rodar essa API, abra o terminal na pasta onde está o arquivo e digite:

```bash
uvicorn main_api:app --reload

```

A mágica do FastAPI acontece agora. Se você abrir o seu navegador e acessar `http://localhost:8000/docs`, você verá o **Swagger UI**. É uma interface visual gerada automaticamente onde você (ou o programador que fizer o seu aplicativo) pode clicar nos botões e testar a API sem precisar escrever nenhuma linha de código a mais.

### 4. Como plugar isso no seu Docker?

Lembra do arquivo `docker-compose.yml` que criamos no passo anterior? Para colocar a API rodando junto com os bots, bancos e calculadoras, basta adicionar este bloco no final dele:

```yaml
  # 6. A API FastAPI para o cliente final
  api_frontend:
    build: ./api # Pasta onde está o main_api.py e o Dockerfile da API
    ports:
      - "8000:8000"
    depends_on:
      - postgres_db
      - redis_cache
    environment:
      - REDIS_URL=redis://redis_cache:6379
      - DATABASE_URL=postgresql://admin:senha_segura_123@postgres_db:5432/drivetax

```

Agora, o fluxo do **DriveTax-Motors** está 100% completo, da ponta a ponta:

1. **Scraper** busca os dados na web e joga na Fila.
2. **Calculadora** puxa da fila, faz as contas e salva no **PostgreSQL**.
3. **API (FastAPI)** recebe o pedido do cliente, busca no banco, salva no **Redis** e entrega no celular do usuário.

Essa é a evolução natural e o modelo onde o **DriveTax-Motors** deixa de ser apenas uma ferramenta de informação e passa a ser uma máquina de **transações financeiras**.

Você está conectando a dor (descobrir que o carro precisa de manutenção) com a solução (vender a peça e entregar em casa ou agendar o serviço). No mercado, chamamos isso de modelo **O2O (Online-to-Offline) / Omnichannel**.

Para que as pessoas comprem online e isso ajude a operação física da loja (sem virar uma bagunça de estoque), você precisará adicionar um **Motor de Vendas e Logística** àquela arquitetura que já desenhamos.

Aqui está como esse ecossistema funciona na prática:

1. **A Sugestão Inteligente (Cross-Selling):** Onde a mágica acontece.
O usuário entra no app e o **Motor de Cálculo** avisa: *"Seu VW Polo chegou aos 40.000 km. É hora de trocar a correia dentada, óleo e filtros"*. Logo abaixo, a sua API já exibe o "Kit Revisão 40k" com um botão de **Comprar Agora**.


2. **Checkout e Pagamento:**
O cliente coloca o produto no carrinho e paga. O sistema usa uma API de pagamento (como **Mercado Pago** ou **Stripe**) que aceita Pix, Boleto ou Cartão de Crédito de forma segura, sem que você precise lidar com dados bancários sensíveis.


3. **Roteamento Logístico:**
O cliente escolhe como quer receber:
**A) Receber em Casa:** A API de frete (como **MelhorEnvio**) calcula o valor dos Correios/Transportadora na hora.
**B) Retire e Instale na Loja:** O sistema abre um calendário para o cliente agendar o box da oficina.


4. **Sincronização com a Loja (A Manutenção da Operação):**
Assim que o pagamento cai, o sistema envia uma notificação (Webhook) para o computador da sua loja física. O estoque é reduzido automaticamente. Se for entrega, gera a etiqueta de envio. Se for agendamento, o mecânico já sabe qual peça separar para aquele dia.


---

## O que você precisa construir (Tecnicamente)

Para não misturar as coisas, você criará um novo microsserviço no seu Docker chamado `motor_ecommerce`. Ele precisará lidar com três integrações fundamentais:

### 1. Gestão de Estoque Unificado

O maior pesadelo de uma loja física que vende online é vender uma peça no site que acabou de ser vendida no balcão físico há 5 minutos.

* **A Solução:** O seu banco de dados PostgreSQL será a "fonte da verdade". O caixa da loja física e o aplicativo do cliente devem ler a mesma tabela de `Estoque`. Quando a quantidade chegar a zero, o app oculta o botão de comprar na mesma hora.

### 2. A API de Pagamento

Você não programa um sistema para processar cartões do zero. Você integra o **Mercado Pago** via API.

* No Python, você envia um pacote JSON com o valor da peça. O Mercado Pago te devolve um "Link de Checkout" ou o código copia e cola do Pix. Quando o cliente paga, o Mercado Pago avisa o seu servidor silenciosamente no fundo (via Webhook): *"O Pedido #1024 foi pago, pode liberar a peça"*.

### 3. A API de Logística

Se o cliente quiser receber em casa, você precisa calcular o frete baseado no peso da peça e no CEP.

* **A Solução:** Integração com APIs como **MelhorEnvio** ou **Frenet**. Você manda o CEP e o peso (ex: 2kg) e eles devolvem os preços de Jadlog, Correios e Azul Cargo. O cliente escolhe, paga, e você só imprime a etiqueta na loja.

## O Impacto na "Manutenção da Loja"

Quando você permite o agendamento de serviços online ("Compre a peça e agende a troca"), a operação da sua loja física muda de patamar:

1. **Previsibilidade:** O gerente da loja sabe exatamente quais carros vão entrar amanhã e quais peças já estão pagas.
2. **Caixa Adiantado:** Você recebe o dinheiro das peças antes mesmo do cliente pisar na loja.
3. **Fim do estoque encalhado:** Se uma peça está parada na prateleira da loja física, o seu Motor de Cálculo pode oferecer um desconto dinâmico no aplicativo para quem tem aquele carro, girando o estoque rápido.

Para hospedar uma arquitetura de microsserviços baseada em Docker (API, banco de dados, filas e motores paralelos), você tem caminhos que variam radicalmente em preço e complexidade.

Como você pediu a combinação ideal entre **baixo custo inicial e capacidade de escalar**, aqui está a realidade do mercado e como as empresas fazem essa transição.

## 1. DigitalOcean: O Melhor Custo-Benefício para o Lançamento

Se você quer colocar o DriveTax-Motors no ar esta semana sem precisar de um diploma em engenharia de infraestrutura, a DigitalOcean é a escolha número um. O preço é previsível e a interface é feita para desenvolvedores.

* **Como funciona:** Você aluga um "Droplet" (uma máquina virtual Linux). Você entra nela, instala o Docker, clona seu repositório do GitHub e roda o `docker-compose up -d`. Simples assim.
* **O Custo (MVP):** Um Droplet com 4GB de RAM e 2 vCPUs custa em torno de **US$ 24 por mês**. Essa máquina aguenta rodar todo o seu sistema tranquilamente para os primeiros milhares de acessos.
* **A Escalabilidade:** Quando os acessos subirem, você pode fazer um "Resize" na máquina com um clique (aumentando para 8GB ou 16GB de RAM). Quando ficar gigante, você assina o **Managed Database** deles para tirar o PostgreSQL de dentro da sua máquina e colocá-lo em um servidor dedicado.

## 2. AWS (Amazon Web Services): O Padrão Ouro da Escala (Com Ressalvas)

A AWS é onde o seu sistema vai morar quando o DriveTax-Motors for uma empresa milionária, mas entrar nela logo no Dia 1 pode ser uma armadilha financeira se você não souber configurar.

* **Como funciona:** Em vez de rodar um `docker-compose` simples, na AWS você usa o **ECS (Elastic Container Service) com Fargate**. O Fargate é "Serverless" (sem servidor). Você diz para a AWS: *"Aqui está o meu contêiner da Calculadora. Se a fila do RabbitMQ passar de 1.000 mensagens, crie 50 cópias desse contêiner. Quando a fila esvaziar, destrua 49 e deixe só um"*. Você paga apenas pelos segundos em que as 50 calculadoras estiveram ligadas.
* **O Custo:** A AWS tem o **Free Tier** (Nível Gratuito) por um ano, o que te permite rodar uma máquina EC2 (t2.micro) e um banco RDS pequeno de graça. Porém, se os robôs consumirem muito processamento e você estourar a cota gratuita, a conta pode saltar rapidamente para mais de US$ 100/mês.
* **A Escalabilidade:** É infinita. A Netflix, o iFood e a Uber rodam em arquiteturas muito parecidas com essa na AWS.

## 3. Hetzner: O Segredo de Baixo Custo dos Hackers

Se você está bancando o projeto do próprio bolso e o dólar é um problema, a **Hetzner** (empresa alemã) é hoje a queridinha dos desenvolvedores independentes.

* Eles não têm a interface bonita da DigitalOcean ou os serviços gerenciados avançados da AWS, mas oferecem **força bruta pelo menor preço do mercado**.
* Você consegue um servidor com processador ARM (os mesmos da Apple), 4 vCPUs e 8GB de RAM por cerca de **US$ 7 a US$ 10 por mês**. É imbatível para rodar Docker pesado.

---

## Comparativo Direto

| Provedor | Foco Principal | Custo Mensal (Base) | Curva de Aprendizado |
| --- | --- | --- | --- |
| **DigitalOcean** | Equilíbrio (Fácil e justo) | ~ US$ 20 a 24 | Baixa (Ideal para Docker Compose) |
| **Hetzner Cloud** | Preço esmagador | ~ US$ 7 a 10 | Média (Você gerencia tudo) |
| **AWS** | Escala infinita e automação | US$ 0 (1º ano) -> US$ 100+ | Alta (Exige estudo em Cloud) |

> **O Conselho de Arquitetura:** Comece com a **DigitalOcean (ou Hetzner)**. Suba tudo em um único servidor usando o `docker-compose` que criamos. Valide o produto com clientes reais. Quando os bots começarem a estrangular a máquina de cálculos, aí sim você migra a arquitetura para a AWS e separa o banco de dados dos servidores de processamento.

Para integrar o e-commerce ao sistema existente sem quebrar a integridade das peças, estoque e agendamentos na oficina, a modelagem no PostgreSQL precisa resolver três desafios principais:

1. **Snapshots de Preço:** O preço de uma peça muda no cadastro, mas o pedido passado deve manter o valor exatamente como foi pago.
2. **Concorrência de Estoque:** Impedir que duas pessoas comprem a mesma peça ao mesmo tempo online ou no balcão físico.
3. **Modelagem Híbrida (Produto + Serviço):** Permitir que um pedido contenha produtos físicos (entrega/retirada) e serviços (agendamento no box da oficina).

---

## O Modelo de Dados Relacional (MER)

O esquema relacional é estruturado em quatro blocos centrais:

```
[ USUÁRIOS / CLIENTES ]
         │
         ├───< [ CARRINHO_ITENS ] >─── [ PRODUTOS / ESTOQUE ]
         │                                   │
         └───< [ PEDIDOS ] >─────────────────┤
                    │                        │
                    ├───< [ PEDIDO_ITENS ] >─┘
                    │
                    ├───1:1─── [ PAGAMENTOS ]
                    │
                    └───1:1─── [ AGENDAMENTOS_SERVICO ]

```

---

## Esquema SQL (PostgreSQL)

### 1. Produtos e Estoque Unificado

A tabela de produtos centraliza os dados. O campo `quantidade_estoque` é a "fonte da verdade" compartilhada entre a loja física e a loja online.

```sql
CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    sku VARCHAR(50) UNIQUE NOT NULL,       -- Código interno da peça (ex: FILTRO-ALT-01)
    nome VARCHAR(150) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL DEFAULT 0,
    peso_gramas INT NOT NULL DEFAULT 0,    -- Usado pela API de frete (MelhorEnvio)
    ativo BOOLEAN DEFAULT TRUE,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

### 2. Carrinho de Compras (Estado Temporário)

O carrinho não armazena o histórico financeiro — ele guarda apenas o que o usuário deseja comprar no momento. Quando o pedido é finalizado, os itens do carrinho são convertidos em itens do pedido e removidos daqui.

```sql
CREATE TABLE carrinho_itens (
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL REFERENCES usuarios(id) ON DELETE CASCADE,
    produto_id INT NOT NULL REFERENCES produtos(id),
    quantidade INT NOT NULL CHECK (quantidade > 0),
    adicionado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT uk_usuario_produto UNIQUE (usuario_id, produto_id)
);

```

### 3. Pedidos e Itens do Pedido

Aqui ocorre a separação entre a **cabeça do pedido** (dados do comprador, valores totais e tipo de entrega) e os **itens** (com snapshot do preço unitário gravado no instante da compra).

```sql
CREATE TYPE tipo_entrega_enum AS ENUM ('ENTREGA_CASA', 'RETIRADA_LOJA', 'INSTALACAO_OFICINA');
CREATE TYPE status_pedido_enum AS ENUM ('AGUARDANDO_PAGAMENTO', 'PAGO', 'EM_PREPARACAO', 'ENVIADO', 'CONCLUIDO', 'CANCELADO');

CREATE TABLE pedidos (
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL REFERENCES usuarios(id),
    status status_pedido_enum DEFAULT 'AGUARDANDO_PAGAMENTO',
    tipo_entrega tipo_entrega_enum NOT NULL,
    valor_subtotal DECIMAL(10, 2) NOT NULL,
    valor_frete DECIMAL(10, 2) DEFAULT 0.00,
    valor_total DECIMAL(10, 2) NOT NULL,
    
    -- Dados de Entrega (se aplicável)
    endereco_cep VARCHAR(9),
    endereco_logradouro VARCHAR(255),
    endereco_numero VARCHAR(20),
    
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE pedido_itens (
    id SERIAL PRIMARY KEY,
    pedido_id INT NOT NULL REFERENCES pedidos(id) ON DELETE CASCADE,
    produto_id INT NOT NULL REFERENCES produtos(id),
    quantidade INT NOT NULL CHECK (quantidade > 0),
    preco_unitario DECIMAL(10, 2) NOT NULL -- SNAPSHOT: valor cobrado no momento da compra
);

```

### 4. Pagamentos (Integração Gateway)

Os detalhes técnicos das transações (Mercado Pago, Stripe ou Pagar.me) ficam desacoplados da tabela de pedidos para permitir que um pedido tenha re-tentativas de pagamento sem corromper seus dados.

```sql
CREATE TYPE status_pagamento_enum AS ENUM ('PENDENTE', 'APROVADO', 'RECUSADO', 'ESTORNADO');
CREATE TYPE meiopagamento_enum AS ENUM ('PIX', 'CARTAO_CREDITO', 'BOLETO');

CREATE TABLE pagamentos (
    id SERIAL PRIMARY KEY,
    pedido_id INT UNIQUE NOT NULL REFERENCES pedidos(id) ON DELETE CASCADE,
    gateway VARCHAR(50) NOT NULL,            -- ex: 'MERCADOPAGO'
    transacao_external_id VARCHAR(100),       -- ID da transação retornado pela API
    meio_pagamento meiopagamento_enum NOT NULL,
    status status_pagamento_enum DEFAULT 'PENDENTE',
    valor_pago DECIMAL(10, 2) NOT NULL,
    qr_code_pix TEXT,                        -- String "copia e cola" do Pix (se aplicável)
    pago_em TIMESTAMP,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

### 5. Agendamento na Oficina (Manutenção Integrada)

Quando a entrega for do tipo `INSTALACAO_OFICINA`, esta tabela reserva um horário no box de serviço da loja física.

```sql
CREATE TABLE agendamentos_servico (
    id SERIAL PRIMARY KEY,
    pedido_id INT UNIQUE NOT NULL REFERENCES pedidos(id) ON DELETE CASCADE,
    veiculo_id INT NOT NULL REFERENCES veiculos(id), -- Vinculado ao veículo do usuário
    data_agendada DATE NOT NULL,
    horario_agendado TIME NOT NULL,
    observacoes TEXT,
    concluido BOOLEAN DEFAULT FALSE
);

```

---

## Regra de Ouro: Controle Transacional de Estoque

Para prevenir a venda de um produto sem estoque suficiente quando dois clientes tentam comprar a mesma peça simultaneamente, a baixa no estoque deve ser tratada no banco de dados usando **Lock Otimista** ou transações com travamento de linha (`FOR UPDATE`):

```sql
-- Exemplo de transação no PostgreSQL ao confirmar o checkout:
BEGIN;

-- 1. Trava a linha do produto e valida a quantidade
SELECT quantidade_estoque 
FROM produtos 
WHERE id = 42 
FOR UPDATE;

-- 2. Atualiza o estoque de forma atômica
UPDATE produtos 
SET quantidade_estoque = quantidade_estoque - 1 
WHERE id = 42 AND quantidade_estoque >= 1;

-- 3. Atualiza o status do pagamento
UPDATE pagamentos 
SET status = 'APROVADO', pago_em = NOW() 
WHERE pedido_id = 1024;

COMMIT;

```

---

## Principais Recursos desta Modelagem

1. **Rastreabilidade total:** Caso o valor de um "Filtro de Óleo" mude de R$ 35,00 para R$ 45,00 na tabela `produtos`, o histórico da tabela `pedido_itens` preserva o valor de R$ 35,00 cobrado na época da transação.
2. **Ciclo de vida do Pix:** Quando um pagamento por Pix é gerado, o campo `qr_code_pix` armazena a string necessária para o aplicativo exibir o código na tela. Assim que o webhook do Mercado Pago notifica o servidor, a tabela `pagamentos` atualiza o status para `APROVADO`.
3. **Escala simplificada:** A estrutura permite adicionar múltiplos estoques (filiais) no futuro criando uma tabela intermediária `estoque_lojas(produto_id, loja_id, quantidade)`, mantendo as tabelas de pedidos e pagamentos intactas.

DRIVETAX-MOTORS // DATABASE ARCHITECTURE
Trigger de Abate Automático de Estoque
Automação transacional no PostgreSQL garantindo consistência entre Pagamentos e Produtos

Para garantir a integridade dos dados e evitar concorrência (vender peças sem estoque), a melhor abordagem é
delegar o abate de estoque diretamente ao motor do banco de dados PostgreSQL por meio de uma Function e
uma Trigger acionada na mudança de status do pagamento.
1. A Função da Trigger (PL/pgSQL)
Esta função é executada sempre que a tabela pagamentos sofre uma atualização. Ela verifica se o status
transicionou para 'APROVADO' e percorre todos os itens do pedido associado reduzindo o estoque de forma
atômica.
CREATE OR REPLACE FUNCTION fn_abater_estoque_apos_pagamento()
RETURNS TRIGGER AS $$
DECLARE
item RECORD;
BEGIN
-- Executa apenas quando o status muda para 'APROVADO' (evita execução duplicada)
IF (NEW.status = 'APROVADO' AND (OLD.status IS NULL OR OLD.status <> 'APROVADO')) THEN
-- Percorre todos os produtos vinculados ao pedido pago
FOR item IN
SELECT produto_id, quantidade
FROM pedido_itens
WHERE pedido_id = NEW.pedido_id
LOOP
-- Tenta atualizar o estoque garantindo que haja quantidade disponível
UPDATE produtos
SET quantidade_estoque = quantidade_estoque - item.quantidade
WHERE id = item.produto_id
AND quantidade_estoque >= item.quantidade;
-- Se nenhuma linha for afetada, o estoque era insuficiente
IF NOT FOUND THEN
RAISE EXCEPTION 'Estoque insuficiente para o produto ID % no Pedido %',

item.produto_id, NEW.pedido_id;

END IF;
END LOOP;
-- Atualiza também o status do pedido para 'EM_PREPARACAO'
UPDATE pedidos
SET status = 'EM_PREPARACAO', atualizado_em = NOW()
WHERE id = NEW.pedido_id;
END IF;
RETURN NEW;
END;
$$ LANGUAGE plpgsql;

2. A Criação da Trigger
A trigger liga a função criada acima aos eventos da tabela pagamentos. Ela é executada AFTER UPDATE para
cada linha alterada.
DROP TRIGGER IF EXISTS trg_abater_estoque ON pagamentos;
CREATE TRIGGER trg_abater_estoque
AFTER UPDATE ON pagamentos
FOR EACH ROW
EXECUTE FUNCTION fn_abater_estoque_apos_pagamento();

Segurança contra Race Conditions e Rollback Total
Se qualquer produto do pedido não tiver estoque suficiente no exato momento da aprovação do pagamento, o PostgreSQL
dispara um RAISE EXCEPTION. Isso aborta a transação inteira e faz o rollback autômato — o status do pagamento não
muda para APROVADO no banco de dados e nenhum produto tem seu estoque alterado.
3. Cenário de Teste / Validação
Você pode testar o comportamento da automação executando a seguinte simulação no seu cliente SQL:
-- Simula o webhook do Mercado Pago atualizando o pagamento para APROVADO
UPDATE pagamentos
SET status = 'APROVADO', pago_em = NOW()
WHERE pedido_id = 1024;

Vantagens Arquiteturais
Consistência ACID: A lógica é transacional. Não há risco da sua aplicação Python falhar no meio do processo
e deixar o estoque inconsistente.
Desacoplamento: O microsserviço de Webhooks/Pagamentos só precisa atualizar uma linha no banco de
dados. O controle de estoque acontece de forma transparente no SGBD.
Sincronização com Loja Física: Se o sistema PDV da loja física estiver conectado ao mesmo PostgreSQL, a
peça fica indisponível para venda presencial no milissegundo em que o Pix é aprovado.

DriveTax-Motors Architecture Documentation • PostgreSQL Automatic Stock Abatement

