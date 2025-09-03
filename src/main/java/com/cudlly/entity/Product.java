package com.cudlly.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku; // stock keeping unit

    private String name;

    @Column(length = 1000)
    private String description;

    private String category;

    private String brand;

    private BigDecimal price;

    private Integer stockQuantity;

    private Boolean active;

    private Double weight;

    private String dimensions;

    private String color;

    private String material;

    private Double rating;

    private Integer reviewsCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
