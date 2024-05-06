package com.example.tpcasandra.repositories;
import com.example.tpcasandra.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}

