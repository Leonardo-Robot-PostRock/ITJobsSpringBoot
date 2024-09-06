package com.ITJobsBackend.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ITJobsBackend.dto.RolesDTO;
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
	
	@GetMapping("/{userId}/roles")
	public Set<RolesDTO> getRoles(@PathVariable Long userId){
		return userService.getUserRolesById(userId);
	}
	
}
