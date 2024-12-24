package com.example.order_service;

import com.example.order_service.dto.Product;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceClient {
    @CircuitBreaker
    public Product getProduct(Long id) {
        // GraphQL call to Produits
        return null;
    }

    public Product fallback(Long id, Throwable ex) {
        return new Product(); // Fallback response
    }
}

