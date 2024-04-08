package com.firstExercise.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstExercise.models.User;

@RestController
public class UserController {
	public String mensaje() {
		return "Hola mundo";
	}

	@RequestMapping(value = "persona")
	public List<String> listPeople() {
		return List.of("Leonardo", "Luciana", "Matias");
	}
	
	@RequestMapping(value = "user")
	public User listUsers() {
		User user = new User();
		
		user.setName("Leonardo");
		user.setSurname("Puebla");
		user.setEmail("leonardo38361@gmail.com");
		user.setPhone("2612589352");
		user.setPassword("1234");
		
		return user;
		 
	}

}
