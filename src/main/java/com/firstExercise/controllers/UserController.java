package com.firstExercise.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstExercise.models.User;

@RestController
public class UserController {
	public String mensaje() {
		return "Hola mundo";
	}

	@RequestMapping(value = "person")
	public List<String> listPeople() {
		return List.of("Leonardo", "Luciana", "Matias");
	}
	
	@RequestMapping(value = "users")
	public User listUsers() {
		User user = new User();
		
		user.setName("Leonardo");
		user.setSurname("Puebla");
		user.setEmail("leonardo@gmail.com");
		user.setPhone("123431243");
		user.setPassword("1234");
		
		return user;
		 
	}
	
	@RequestMapping(value = "user/{id}")
	public User getUserById(@PathVariable Long id) {
		User user = new User();
		
		user.setId(id);
		user.setName("Leonardo");
		user.setSurname("Puebla");
		user.setEmail("leonardo@gmail.com");
		user.setPhone("2556881234");
		user.setPassword("1234");
		
		return user;
		
	}
	
	@RequestMapping(value = "list/user")
	public List<User> list_severalUsers() {
		List<User> user = new ArrayList<>();
		
		User firstUser = new User();
		
		firstUser.setId(3L);
		firstUser.setName("Leonardo");
		firstUser.setSurname("Puebla");
		firstUser.setEmail("leonardo@gmail.com");
		firstUser.setPhone("2612589352");
		firstUser.setPassword("1234");
		
		User secondUser = new User();
		
		secondUser.setId(4L);
		secondUser.setName("Leonardo");
		secondUser.setSurname("Puebla");
		secondUser.setEmail("leonardo@gmail.com");
		secondUser.setPhone("123123124");
		secondUser.setPassword("5678");
		
		user.add(firstUser);
		user.add(secondUser);
		
		return user;
		
	}

}
