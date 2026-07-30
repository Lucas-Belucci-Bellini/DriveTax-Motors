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

