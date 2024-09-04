package com.ITJobsBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ITJobsBackend.dao.UserDao;
import com.ITJobsBackend.models.User;


@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@CrossOrigin(origins="http://localhost:3000")
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
		return userDao.findUserById(id);
	}
}
