package com.firstExercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstExercise.dao.UserDao;
import com.firstExercise.models.User;

@RestController
public class UserControllerWithID {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "api/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		List<User> user = userDao.getUsers();

		return user;
	}

	@RequestMapping(value = "api/delete-user/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		userDao.deleteUserById(id);
	}

	@RequestMapping(value = "api/add-user", method = RequestMethod.POST)
	public void add(@RequestBody User user) {
		userDao.addUser(user);
	}

	@RequestMapping(value = "api/update-user/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody User user) {
		userDao.updateUser(id, user);
	}

	@RequestMapping(value = "api/user/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") Long id) {
		return userDao.getUserById(id);
	}
}
