package com.store.book.online.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.book.online.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String>{
}
