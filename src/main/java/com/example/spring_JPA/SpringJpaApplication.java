package com.example.spring_JPA;

import com.example.spring_JPA.entities.Address;
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
				.username("John")
				.password("password")
				.email("vikas@google.com")
				.build();
		System.out.println(user.getEmail());
		var address = Address.builder()
				.street("stree")
				.city("city")
				.state("state")
				.zip("zip").build();
		user.addAddress(address);
		System.out.println(user);
		user.removeAddress(address);
		System.out.println(user);

	}
}
