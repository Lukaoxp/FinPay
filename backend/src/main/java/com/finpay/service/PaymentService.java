package com.finpay.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finpay.domain.PaymentOrder;

@Service
public class PaymentService {
    private final List<PaymentOrder> store = new ArrayList<>(); // In-memory store for now;

    public PaymentOrder create(BigDecimal amount) {
        PaymentOrder order = new PaymentOrder(amount);
        store.add(order);
        return order;
    }

    public Optional<PaymentOrder> findById(String id) {
        return store.stream().filter(o -> o.getId().equals(id)).findFirst();
    }

    public List<PaymentOrder> findAll() {
        return List.copyOf(store);
    }

    public PaymentOrder pay(String id) {
        PaymentOrder order = findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found: " + id));
        order.markAsPaid();
        return order;
    }
}
