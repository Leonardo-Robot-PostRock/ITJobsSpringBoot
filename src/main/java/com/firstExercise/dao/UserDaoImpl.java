package com.firstExercise.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.firstExercise.models.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getUsers() {
		return null;
	}

}
