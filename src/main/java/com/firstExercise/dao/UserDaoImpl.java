package com.firstExercise.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.firstExercise.models.User;

import jakarta.persistence.EntityManager;


@Repository
public class UserDaoImpl implements UserDao {

	private EntityManager entityManager;
	
	@Override
	public List<User> getUsers() {
		String query = "from User";
		List<User> result = entityManager.createQuery(query).getResultList();
		
		return result;
	}

}
