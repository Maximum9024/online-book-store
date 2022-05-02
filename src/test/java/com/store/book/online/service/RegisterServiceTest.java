package com.store.book.online.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.store.book.online.repository.UserRepository;

@SpringBootTest
class RegisterServiceTest {

	@Autowired
	private UserRepository userRepository;
	@Test
	@DisplayName("test if user already exists.")
	void testRegisterUser() {
		String email="bucky@gmail.com";
		
		assertTrue(userRepository.existsByEmail(email));

	}

}
