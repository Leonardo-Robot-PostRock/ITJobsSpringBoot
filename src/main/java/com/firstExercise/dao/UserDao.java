package com.firstExercise.dao;

import java.util.List;
import com.firstExercise.models.User;
import jakarta.transaction.Transactional;

@Transactional
public interface UserDao {
	public List<User> getUsers();
}
