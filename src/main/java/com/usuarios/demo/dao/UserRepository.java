package com.usuarios.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuarios.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@SuppressWarnings("unchecked")
	User save(User user);
	
}
