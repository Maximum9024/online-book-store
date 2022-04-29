package com.store.book.online.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.model.User;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@PostMapping("/user")
	public void registerUser(@RequestBody User user ) {
		
	}

}
