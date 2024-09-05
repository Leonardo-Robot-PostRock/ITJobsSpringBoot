package com.ITJobsBackend.dao;

import java.util.List;
import com.ITJobsBackend.models.User;
import jakarta.transaction.Transactional;

@Transactional
public interface UserDao {
	public List<User> getUsers();

	void deleteUserById(Long id);
	
	void addUser(User user);
	
	void updateUser(Long id,User user);
	
	public User findUserById(Long id);
}
