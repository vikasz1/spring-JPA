package com.example.spring_JPA.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval = true)
    @Builder.Default
    private List<Address> addresses = new ArrayList<>();

    public  void addAddress(Address address){
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address){
        addresses.remove(address);
        address.setUser(null);
    }

    public void addTag(String tagName){
        var tag = new Tag(tagName);
        tags.add(tag);
        tag.getUsers().add(this);
    }
    public void removeTag(String tagName){
        var tag = new Tag(tagName);
        tags.remove(tag);
        tag.getUsers().add(this);
    }
    public void addFavouriteProduct(Product product){
        wishLists.add(product);
    }
    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    @OneToOne(mappedBy = "user")
    private Profile profile;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "wishlist",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> wishLists = new HashSet<>();




}
