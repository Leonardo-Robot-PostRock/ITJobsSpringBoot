package com.firstExercise.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	public String mensaje() {
		return "Hola mundo";
	}

	@RequestMapping(value = "persona")
	public List<String> listPeople() {
		return List.of("Leonardo", "Luciana", "Matias");
	}
	
	

}
