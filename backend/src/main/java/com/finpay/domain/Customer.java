package com.finpay.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private String id;
    private String name;
    private String email;
    private LocalDateTime createdAt;

    public Customer(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    public boolean isValidEmail() {
        return email.contains("@") && email.contains(".");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Customer: {id=" + id + ", name=" + name + ", email=" + email + "}";
    }
}