package com.ganesh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ganesh.entity.User;
import com.ganesh.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	
	
	@Autowired
	UserRepository userRepository;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> byUserName = userRepository.findByUsername(username);
		
		if (byUserName.isPresent()) {
			
			User user = byUserName.get();
			
			return org.springframework.security.core.userdetails.User
					.withUsername(user.getUsername())
					.password(user.getPassword())
					.roles(user.getRole())
					.build();
		}
		
		throw new UsernameNotFoundException("User Not Found With UserName = "+username);
	}

}
