package com.ITJobsBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ITJobsBackend.dto.UserDTO;
import com.ITJobsBackend.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "api/users")
	public List<UserDTO> getUsers() {
		return userService.getUsers();
	}

}
