package com.kalaiz.cahoo_backend;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kalaiz.cahoo_backend.repository.AppUserRepository;


@Service
public class UserService implements UserDetailsService{

	
	private final AppUserRepository userRepository;
	
	UserService(AppUserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	private final static String USER_NOT_FOUND = "User who has email %s not found";
	@Override
	public UserDetails loadUserByUsername(String email) 
			throws UsernameNotFoundException {

		return userRepository.findByEmail(email)
				.orElseThrow(()-> new UsernameNotFoundException(String.format(USER_NOT_FOUND,email)));
	}

	
}
