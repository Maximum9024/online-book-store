package com.store.book.online.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.dto.NewOrderDTO;
import com.store.book.online.dto.ViewOrderDTO;
import com.store.book.online.model.Book;
import com.store.book.online.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired 
	private OrderService orderService;
	
	@PostMapping("/orderBook")
	public NewOrderDTO orderBook(@RequestBody NewOrderDTO order) {		
	   return orderService.orderBook(order);
	}
	
	@GetMapping("/viewOrder/{email}/{orderNo}")
	public List<Book> viewOrder(@PathVariable("email") String email,@PathVariable("orderNo")long orderNo) {
		return orderService.viewOrder(email,orderNo);	
	}
}
