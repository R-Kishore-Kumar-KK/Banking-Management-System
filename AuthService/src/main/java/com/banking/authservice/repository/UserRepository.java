package com.banking.authservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.authservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public Optional<User> findByEmail(String email);
	
	public boolean existsByEmail(String email);
	
	public boolean existsByMobileNumber(String mobileNumber);
}
