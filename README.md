# FinPay

Payment management REST API — customers, payment orders, and status transitions (`PENDING → PAID → CANCELLED`).

Built with Java 25 + Spring Boot 3.5 following hexagonal architecture. Covers JWT auth, CQRS, audit log, idempotency keys, resilience patterns, and full observability.

## Repository Structure

```
finpay/
├── backend/    # Spring Boot REST API
└── frontend/   # Coming soon (vanilla JS → Next.js → Angular)
```

## Stack

| Layer | Tech |
|---|---|
| API | Java 25 · Spring Boot 3.5 |
| Database | PostgreSQL · Flyway migrations |
| Auth | JWT (access + refresh token rotation) |
| Testing | JUnit 5 · Mockito · Testcontainers |
| Resilience | Resilience4j (retry, circuit breaker, bulkhead) |
| Cache | Spring Cache + Valkey |
| Observability | Micrometer · Prometheus · Grafana |
| Containers | Docker |

## Getting Started

→ [backend/README.md](backend/README.md)
