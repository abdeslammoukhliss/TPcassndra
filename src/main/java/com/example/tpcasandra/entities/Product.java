package com.example.tpcasandra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @PrimaryKey
    private UUID id;
    private String name;
    private double price;
    private int quantiteStock;

    // Getters and setters
}
