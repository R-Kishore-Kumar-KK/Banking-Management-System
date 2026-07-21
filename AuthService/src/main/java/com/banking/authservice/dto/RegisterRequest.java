package com.banking.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

	@NotBlank(message = "First Name is required")
	private String firstName;
	
	@NotBlank(message = "Last Name is required")
	private String lastName;
	
	@Email(message = "Invalid Email format")
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Mobile Number is required")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Mobile Number")
	private String mobileNumber;
	
	@NotBlank(message = "Password is required")
	@Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	private String password;
}
