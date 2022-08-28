package com.kalaiz.cahoo_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	private UserService userService;
	private final String SUCCESSFULLY_CREATED_USER_MESSAGE = "Successfully created user";
	private final String FAILED_TO_CREATE_USER_MESSAGE = "Failed to create user; User already exists!";

	@Autowired
	public RegistrationService(UserService userService) {
		this.userService = userService;
	}

	public String register(Registration request) {
		String message = SUCCESSFULLY_CREATED_USER_MESSAGE;
		try {
			userService.loadUserByUsername(request.getEmail());
			message = FAILED_TO_CREATE_USER_MESSAGE;
		} catch (UsernameNotFoundException exception) {
			userService.createUser(request);
		}
		return message;
	}

}
