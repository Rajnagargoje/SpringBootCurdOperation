package com.employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

	
	User findByEmail(String email);

}
