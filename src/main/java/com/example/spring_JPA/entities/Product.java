package com.example.spring_JPA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Byte id;

    @Column(name="description")
    private String description;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
