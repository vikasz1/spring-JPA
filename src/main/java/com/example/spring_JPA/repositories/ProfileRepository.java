package com.example.spring_JPA.repositories;

import com.example.spring_JPA.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile,Long> {

}
