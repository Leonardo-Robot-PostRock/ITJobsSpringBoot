package com.ITJobsBackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ITJobsBackend.domain.User;
import com.ITJobsBackend.dto.UserDTO;
import com.ITJobsBackend.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Transactional(readOnly = true)
	public List<UserDTO> getUsers() {
		List<User> users = userRepository.findAll();
		return users.stream()
				.map(user -> new UserDTO.UserDTOBuilder()
						.withName(user.getName())
						.withSurname(user.getSurname())
						.withDNI(user.getDni())
						.withEmail(user.getEmail())
						.withPhone(user.getPhone())
						.build())
				.collect(Collectors.toList());
	}

}
