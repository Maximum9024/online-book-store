package com.store.book.online.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.store.book.online.model.Book;
import com.store.book.online.repository.BookRepository;

@SpringBootTest
class CatalogueServiceTest {
     
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	@DisplayName("This passes if returns list of books.")
	void testGetBooks() {
		List<Book>books= (List<Book>) bookRepository.findAll();
		assertNotNull(books);
		
	}

}