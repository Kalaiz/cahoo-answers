package com.kalaiz.cahoo_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiz.cahoo_backend.Registration;
import com.kalaiz.cahoo_backend.RegistrationService;

@RestController
@RequestMapping(path = "api/registration")
public class RegistrationController {
	
	private RegistrationService registrationService;
	
	public RegistrationController(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	@PostMapping
	public String register(@RequestBody Registration request) {
		return registrationService.register(request);
	}

}
