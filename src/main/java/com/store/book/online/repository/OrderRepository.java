package com.store.book.online.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.book.online.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String>{
	
	public Order findById(long id);
}
