package com.example.spring_JPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "profile")
@Getter
@Setter
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bio")
    private String bio;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
    @Column(name = "loyaltyPoints")
    private int loyaltyPoints;
}
