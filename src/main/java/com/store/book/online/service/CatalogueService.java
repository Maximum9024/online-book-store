package com.store.book.online.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.book.online.model.Book;
import com.store.book.online.repository.BookRepository;

@Service("CatalogueService")
public class CatalogueService {
 
   @Autowired
   private BookRepository bookRepository;
   
   /*
    *  list of available books
    *  
   */
   private static final Logger logger = LoggerFactory.getLogger(CatalogueService.class);

   public List<Book> getBooks(){
	   
	   List<Book> booksList= (List<Book>) bookRepository.findAll();
	   logger.info("list of books displayed.");
	   return booksList;
   }
}
