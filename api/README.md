# API

Este diretório conterá o serviço HTTP leve que expõe endpoints para executar calculadoras remotamente.

Esqueleto Spring Boot adicionado (pasta `src/main/java`).

Run (requires Maven and Java 17):

```bash
cd api
mvn spring-boot:run
```

Endpoints (skeleton):
- POST `/api/calculate` — recebe JSON e retorna um `echo` ou, se presente, o conteúdo de `../core_engine/output.json`.

Notes:
- To integrate with the Python `core_engine`, either call the Python script from Java (ProcessBuilder) and read `core_engine/output.json`, or reimplement the engine in Java and call it directly.
