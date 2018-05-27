package com.usuarios.demo.controllers;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.usuarios.demo.model.User;
import com.usuarios.demo.service.UserService;
import com.usuarios.demo.util.RestResponse;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) 
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		User user = this.mapper.readValue(userJson, User.class);
		
		if(!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no estan diligenciados");
		}
		
		this.userService.save(user);
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion Exitosa");
	}
	
	private boolean validate(User user) {
		boolean isValid = true;
		
		if(StringUtils.trimToNull(user.getPrimerNombre()) == null) {
			isValid = false;
		}
		
		if(StringUtils.trimToNull(user.getPrimerApellido()) == null) {
			isValid = false;
		}
		
		if(StringUtils.trimToNull(user.getCorreo()) == null) {
			isValid = false;
		}
		
		return isValid;
	}
		
}
