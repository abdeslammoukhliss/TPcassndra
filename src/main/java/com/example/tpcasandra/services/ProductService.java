package com.example.tpcasandra.services;

import com.example.tpcasandra.entities.Product;
import com.example.tpcasandra.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchByKeyword(String keyword) {
        // Implement search logic based on keyword
        // For example, you can use query methods in repository or custom queries
        return null;
    }
}
