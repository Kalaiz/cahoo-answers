package com.kalaiz.cahoo_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiz.cahoo_backend.User;
import com.kalaiz.cahoo_backend.repository.UserRepository;

@RestController
public class UserController {
	 private UserRepository userRepository;
	 
	 @GetMapping("user/{userId}")
	 List<User> getUser(@PathVariable Long userId){
//		 TODO:
		 return userRepository.findAll();
	 }
	

}
