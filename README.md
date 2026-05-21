# Rest Request List

API REST simples desenvolvida em Java com Spring Boot para retornar uma lista de produtos agrupados por departamento. O projeto foi criado como prática de construção de endpoints REST, serialização JSON e organização básica de entidades.

## Funcionalidades

- Endpoint REST para consulta de produtos.
- Retorno em JSON com dados de produto e departamento.
- Estrutura simples com controller e entidades de domínio.
- Porta configurada para `8081`.

## Tecnologias

- Java 17
- Spring Boot
- Maven
- Spring Web

## Estrutura do Projeto

```text
src/main/java/com/apirest/app
├── controller
│   └── ProductController.java
├── entities
│   ├── Department.java
│   └── Products.java
└── AppApplication.java
```

## Como Executar

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8081
```

## Endpoint

### Listar produtos

```http
GET /products
```

Exemplo de resposta:

```json
[
  {
    "id": 1,
    "name": "Mouse Pro",
    "price": 560.0,
    "department": {
      "id": 1,
      "name": "Tech"
    }
  }
]
```

## Melhorias Futuras

- Adicionar persistência com banco de dados.
- Criar endpoints para cadastro, atualização e remoção de produtos.
- Adicionar DTOs e camada de serviço.
- Criar testes unitários para o controller.
