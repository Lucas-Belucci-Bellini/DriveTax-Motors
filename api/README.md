# API

Este diretório conterá o serviço HTTP leve que expõe endpoints para executar calculadoras remotamente.

Exemplo de endpoint planejado:
- `POST /calculate` — recebe JSON do scraper e retorna `output.json` com resultados.

Planejamento:
- Implementar em Spring Boot (Java) para integrar direto com o core engine, ou criar um microservice Python (Flask/FastAPI).
