package com.banking.authservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse {

	private Long userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String mobileNumber;
	
	private String message;
}
