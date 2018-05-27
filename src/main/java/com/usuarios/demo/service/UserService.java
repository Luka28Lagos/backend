package com.usuarios.demo.service;

import java.util.List;

import com.usuarios.demo.model.User;

public interface UserService {

	/**
	 * Guarda un Usuario
	 * @param user
	 * @return Usuario Guardado
	 */
	User save(User user);

	/**
	 * Recupera la Lista de Usuarios
	 * @return Lista de Usuarios
	 */
	List<User> findAll();

	/**
	 * Elimina un usuario con el id recibido
	 * 
	 * @param id
	 */
	void deleteUser(Long id);

}
