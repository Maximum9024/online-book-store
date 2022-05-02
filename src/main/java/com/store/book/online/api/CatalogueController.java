package com.store.book.online.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.online.model.Book;
import com.store.book.online.service.CatalogueService;

@RestController
@RequestMapping("/catalogue")
public class CatalogueController {
	
	@Autowired
	private CatalogueService catalogueService;
	/*
	 * return list of books
	 */
	@GetMapping("/getBooks")
	public List<Book> listOfBooks() {
	return 	catalogueService.getBooks();
	}

}
