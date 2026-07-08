package com.ganesh.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.ganesh.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class Config {
	
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	
	@Bean
	public DaoAuthenticationProvider authenticateUser() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(customUserDetailsService);
		
		provider.setPasswordEncoder(encoder());
		
		return provider;
	}
	
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.csrf(csrf->csrf.disable());
		
		http.httpBasic(Customizer.withDefaults());
		
		http.authorizeHttpRequests(auth->{
			
			auth.requestMatchers("/api/v1/employee/save").hasRole("ADMIN");
			
			auth.requestMatchers("/api/v1/employee/all").hasAnyRole("USER", "ADMIN");
			
			auth.requestMatchers("/api/v1/employee/byid/**").hasRole("USER");
			
			auth.requestMatchers("/auth/create-user").permitAll();
		});
		
		return http.build();
	}

}
