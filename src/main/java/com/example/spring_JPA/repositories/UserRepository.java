package com.example.spring_JPA.repositories;

import com.example.spring_JPA.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
