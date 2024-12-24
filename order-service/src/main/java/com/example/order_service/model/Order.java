package com.example.order_service.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Order {
    @Id
    private String id;
    private String productId;
    private int quantity;

    public String getProductId() {
        return productId;
    }

// Getters and setters
}
