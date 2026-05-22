package com.finpay.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Customer {
    private final String id;
    private String name;
    private String email;
    private final LocalDateTime createdAt;

    public Customer(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    @Override
    public String toString() {
        return "Customer: {id=" + id + ", name=" + name + ", email=" + email + "}";
    }
}