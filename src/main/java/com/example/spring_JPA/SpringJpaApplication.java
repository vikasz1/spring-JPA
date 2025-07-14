package com.example.spring_JPA;

import com.example.spring_JPA.entities.User;
import com.example.spring_JPA.repositories.UserRepository;
import com.example.spring_JPA.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class);
		var service = context.getBean(UserService.class);

		service.showRelateEntities();
//		var user = new User(1L,"vikasz1","vikas@google.com","hello world");
//		System.out.println(user.getEmail());
//		Create a complex object from a Lombok annotated class with @Builder
//
	}
}
