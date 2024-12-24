package com.example.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    // Getters and setters
}
