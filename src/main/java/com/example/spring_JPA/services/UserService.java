package com.example.spring_JPA.services;

import com.example.spring_JPA.entities.Address;
import com.example.spring_JPA.entities.User;
import com.example.spring_JPA.repositories.AddressRepository;
import com.example.spring_JPA.repositories.ProfileRepository;
import com.example.spring_JPA.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor

public class UserService    {
    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final ProfileRepository profileRepository;
    private final AddressRepository addressRepository;

    @Transactional
    public void showEntityState(){
        var user = User.builder()
                .name("vikas")
                .email("vikas@optum.com")
                .password("Password")
                .build();
        if (entityManager.contains(user))
            System.out.println("Persistent");
        else{
            System.out.println("Transient/Detatched");
        }
        userRepository.save(user);

        if (entityManager.contains(user))
            System.out.println("Persistent");
        else{
            System.out.println("Transient/Detatched");
        }
    }
    @Transactional
    public void showRelateEntities(){
        var profile = profileRepository.findById(2L).orElseThrow();
        System.out.println(profile.getUser().getEmail());
    }

    public void fetchAddress(){
        var address = addressRepository.findById(1L).orElseThrow();
        System.out.println(address);
    }

    public void persistRelated(){
        var user = User.builder()
                .name("vikas")
                .email("vikas@optum.com")
                .password("password")
                .build();
        var address = Address.builder()
                .street("Street")
                .city("Ghazipur")
                .state("UP")
                .zip("233322")
                .build();

        user.addAddress(address);
        userRepository.save(user);

    }
    @Transactional
    public void deleteRelated(){
        var user = userRepository.findById(6L).orElseThrow();
        var address = user.getAddresses().getFirst();
        user.removeAddress(address);
        userRepository.save(user);
    }
}
