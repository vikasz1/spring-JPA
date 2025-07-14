package com.example.spring_JPA.repositories;

import com.example.spring_JPA.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {

}
