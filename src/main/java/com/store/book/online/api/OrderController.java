package com.store.book.online.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@PostMapping("/book")
	public void orderBook(@RequestBody Order order) {
		
	}

}
