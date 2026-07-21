package com.banking.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.authservice.dto.RegisterRequest;
import com.banking.authservice.dto.RegisterResponse;
import com.banking.authservice.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
@Validated
public class AuthController {

	@Autowired
	private AuthService authService;
	
	public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
		RegisterResponse registerResponse = authService.register(registerRequest);
		return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
	}
}
