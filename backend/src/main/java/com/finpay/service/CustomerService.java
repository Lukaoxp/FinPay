package com.finpay.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finpay.domain.Customer;

@Service
public class CustomerService {
    private final List<Customer> store = new ArrayList<>();

    public Customer create(String name, String email) {
        if (!Customer.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }
        Customer customer = new Customer(name, email);
        store.add(customer);
        return customer;
    }

    public Optional<Customer> findById(String id) {
        return store.stream().filter(o -> o.getId().equals(id)).findFirst();
    }

    public List<Customer> findAll() {
        return List.copyOf(store);
    }
}
