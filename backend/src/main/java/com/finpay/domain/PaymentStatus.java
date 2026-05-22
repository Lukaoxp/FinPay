package com.finpay.domain;

public enum PaymentStatus {
    PENDING,
    PAID,
    CANCELLED;

    public boolean isFinal() {
        return this == PAID || this == CANCELLED;
    }
}
