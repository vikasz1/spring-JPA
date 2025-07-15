package com.example.spring_JPA.repositories;

import com.example.spring_JPA.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
