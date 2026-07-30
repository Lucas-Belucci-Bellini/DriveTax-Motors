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