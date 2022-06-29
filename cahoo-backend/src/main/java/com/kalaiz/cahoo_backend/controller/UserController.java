package com.kalaiz.cahoo_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiz.cahoo_backend.AppUser;
import com.kalaiz.cahoo_backend.repository.AppUserRepository;



@RestController
public class UserController {
	 private AppUserRepository userRepository;
	 
	 @GetMapping("user/{userId}")
	 List<AppUser> getUser(@PathVariable Long userId){
		 return userRepository.findAll();
	 }
	

}
