package com.banking.authservice.service;

import com.banking.authservice.dto.RegisterRequest;
import com.banking.authservice.dto.RegisterResponse;

public interface AuthService {

	public RegisterResponse register(RegisterRequest request); 
}
