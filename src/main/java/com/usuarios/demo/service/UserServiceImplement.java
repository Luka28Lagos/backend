package com.usuarios.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuarios.demo.dao.UserRepository;
import com.usuarios.demo.model.User;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	protected UserRepository userRepository;
	
	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
}
