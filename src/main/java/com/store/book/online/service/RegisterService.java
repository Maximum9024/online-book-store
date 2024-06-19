package com.store.book.online.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.book.online.dto.UserDTO;
import com.store.book.online.model.User;
import com.store.book.online.repository.UserRepository;

import net.bytebuddy.implementation.bytecode.Throw;

@Service("RegisterService")
public class RegisterService {

	@Autowired
	private UserRepository userRepository;
	/*
	 *registering a user 
	 */
	private static final Logger logger = LoggerFactory.getLogger(RegisterService.class);
	public User registerUser(UserDTO userDetails) {
		//check if user exists.
		User newUser= userRepository.findUserByEmail(userDetails.getEmail());

		if(newUser==null) {
			newUser= new User();
			newUser.setName(userDetails.getName());
			newUser.setEmail(userDetails.getEmail());
			userRepository.save(newUser);
			logger.info("user "+userDetails.getName()+" successfully registered.");

		}else {
			logger.info("user "+userDetails.getName()+" already exists, you can order a book.");
		}	
		return newUser;
	}
}
