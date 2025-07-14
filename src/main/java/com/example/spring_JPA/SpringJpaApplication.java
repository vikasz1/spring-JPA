package com.example.spring_JPA;

import com.example.spring_JPA.entities.User;
import com.example.spring_JPA.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class);
		var repository = context.getBean(UserRepository.class);
//		var user = User.builder()
//				.name("John")
//				.email("vikas@optum.com")
//				.password("helloworld")
//				.build();
//
//		repository.save(user);
//		var user = repository.findById(1L).orElseThrow();
//		System.out.println(user.getEmail());
//		repository.findAll().forEach(u -> System.out.println(u.getEmail()));

//		Delete
		repository.deleteById(1L);
//		var user = new User(1L,"vikasz1","vikas@google.com","hello world");
//		System.out.println(user.getEmail());
//		Create a complex object from a Lombok annotated class with @Builder
//
	}
}
