package com.example.spring_JPA.services;

import com.example.spring_JPA.entities.User;
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

}
