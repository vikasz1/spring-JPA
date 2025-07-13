package com.example.spring_JPA;

import com.example.spring_JPA.entities.Address;
import com.example.spring_JPA.entities.Profile;
import com.example.spring_JPA.entities.Tag;
import com.example.spring_JPA.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaApplication.class, args);
//		var user = new User(1L,"vikasz1","vikas@google.com","hello world");
//		System.out.println(user.getEmail());
//		Create a complex object from a Lombok annotated class with @Builder
		var user = User.builder()
				.id(123L)
				.username("John")
				.password("password")
				.email("vikas@google.com")
				.build();
		var profile = Profile.builder()
				.bio("bio")
				.build();
		user.setProfile(profile);
		profile.setUser(user);
		System.out.println(user);
	}
}
