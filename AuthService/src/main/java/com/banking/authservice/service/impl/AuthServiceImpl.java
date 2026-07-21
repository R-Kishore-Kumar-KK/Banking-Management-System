package com.banking.authservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.authservice.dto.RegisterRequest;
import com.banking.authservice.dto.RegisterResponse;
import com.banking.authservice.repository.UserRepository;
import com.banking.authservice.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public RegisterResponse register(RegisterRequest request) {
		return null;
	}

}
