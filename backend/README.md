# FinPay — Backend

Spring Boot REST API for payment order management.

## Requirements

- Java 25
- Maven wrapper included (`./mvnw`) — no separate Maven install needed
- PostgreSQL running locally (or via Docker)

## Setup

Configure `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/finpay
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=validate
```

Flyway runs all migrations automatically on startup.

## Running

```bash
./mvnw spring-boot:run
```

VS Code / IntelliJ: open `FinpayApplication.java` and click the **Run** button above `main`.

## Testing

```bash
./mvnw test
```

## Dependencies

| Tech | Version |
|---|---|
| Spring Boot | 3.5.14 |
| Java | 25 LTS |
| Spring Web | Boot BOM |
| Spring Data JPA | Boot BOM |
| Spring Validation | Boot BOM |
| Flyway | Boot BOM |
| PostgreSQL driver | Boot BOM |
| JUnit 5 + Mockito | Boot BOM |
