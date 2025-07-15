package com.example.spring_JPA.repositories;

import com.example.spring_JPA.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Byte> {
}
