# DevCalc API
![CI Status](https://img.shields.io/github/actions/workflow/status/fernandotelheiro/devcalc-api/ci.yml?branch=main&label=CI%20build)

DevCalc é uma API REST simples de calculadora escrita em Java utilizando o framework Javalin.

Ela é usada para praticar conceitos de DevOps, CI/CD, Docker, Kubernetes e GitHub Actions.

## Tecnologias

- Java 17
- Maven
- Javalin
- JUnit 5

## Endpoints

Base: `http://localhost:7000`

- `GET /add?a=10&b=5` → `15.0`
- `GET /subtract?a=10&b=5` → `5.0`
- `GET /multiply?a=10&b=5` → `50.0`
- `GET /divide?a=10&b=5` → `2.0`

## Como executar localmente

```bash
mvn clean package
java -cp target/devcalc-api-1.0-SNAPSHOT.jar com.devcalc.DevCalcApplication

mvn test
