package com.firstExercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstExercise.dao.UserDao;
import com.firstExercise.models.User;

@RestController
public class UserControllerWithID {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "api/users")
	public List<User> getUsers() {
		List<User> user = userDao.getUsers();

		return user;
	}
}
