package com.store.book.online.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.model.Book;

@RestController
@RequestMapping("/catalogue")
public class CatalogueController {
	
	@GetMapping("books")
	public void listOfBooks(@RequestBody List<Book> books) {
		
	}

}
