package com.store.book.online.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.store.book.online.repository.BookRepository;

@SpringBootTest
class OrderServiceTest {
   
	@Autowired
    private BookRepository bookRepository;
	
	@Test
	@DisplayName("check if the book does not exists.")
	void testOrderBook() {
	 String bookName="Atomic Habits";
	 assertFalse(bookRepository.existsByName(bookName));
	}

}
