package com.ganesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	
	
	@PostMapping("/create-user")
	public void createUsers(@RequestBody User user) {
		
	}
	
	
}
