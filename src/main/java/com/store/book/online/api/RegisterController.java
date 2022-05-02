package com.store.book.online.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.dto.UserDTO;
import com.store.book.online.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;	
	
	@PostMapping("/registerUser")
	public void registerUser(@RequestBody UserDTO user ) {
		registerService.registerUser(user);
	}

}
