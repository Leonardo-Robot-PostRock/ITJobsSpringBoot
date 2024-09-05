package com.ITJobsBackend.repository;

import org.springframework.data.jpa.repository.*;

import com.ITJobsBackend.domain.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
