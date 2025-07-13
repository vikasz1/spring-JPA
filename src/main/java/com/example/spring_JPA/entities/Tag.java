package com.example.spring_JPA.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "tags")
@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Tag    {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User>  users = new HashSet<>();

    public Tag(String name) {
        this.name = name;
    }
}
