package com.ITJobsBackend.services;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ITJobsBackend.domain.Roles;
import com.ITJobsBackend.domain.User;
import com.ITJobsBackend.dto.RolesDTO;
import com.ITJobsBackend.dto.UserDTO;
import com.ITJobsBackend.dto.UserDTO.UserDTOBuilder;
import com.ITJobsBackend.repository.UserRepository;

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
                    .map(user -> directBuild(UserDTO.builder(), user))
                    .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Set<RolesDTO> getUserRolesById(Long userId) {
        User user = userRepository.findById(userId)
                                  .orElseThrow(() -> new RuntimeException("User not found"));

        return user.getRoles().stream()
                   .map(role -> UserService.mapRoleToDTO(role))
                   .collect(Collectors.toSet());
    }

    public static UserDTO directBuild(UserDTOBuilder builder, User user) {
        Set<RolesDTO> rolesDTO = user.getRoles().stream()
                                      .map(UserService::mapRoleToDTO)
                                      .collect(Collectors.toSet());

        return builder.withName(user.getName())
                      .withSurname(user.getSurname())
                      .withDNI(user.getDni())
                      .withEmail(user.getEmail())
                      .withPhone(user.getPhone())
                      .withRoles(rolesDTO)
                      .build();
    }

    private static RolesDTO mapRoleToDTO(Roles role) {
        return RolesDTO.builder()
        		.withId(role.getId())
        		.withName(role.getName())
        		.withDescription(role.getDescription())
        		.build(); 
    }
}
