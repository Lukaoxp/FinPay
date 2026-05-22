package com.finpay.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentOrder {
    private String id;
    private BigDecimal amount;
    private PaymentStatus status;
    private LocalDateTime createdAt;

    public PaymentOrder(BigDecimal amount) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    public void markAsPaid() {
        if (this.status != PaymentStatus.PENDING) {
            throw new IllegalStateException("Only PENDING orders can be marked as PAID");
        }
        this.status = PaymentStatus.PAID;
    }

    public void cancel() {
        if (this.status != PaymentStatus.PENDING) {
            throw new IllegalStateException("Cannot cancel a PAID or already cancelled order");
        }
        this.status = PaymentStatus.CANCELLED;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "PaymentOrder: {id=" + id + ", amount=" + amount + ", status=" + status + "}";
    }
}