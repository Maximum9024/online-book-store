package com.store.book.online.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.book.online.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	public User findById(long id);
	public User findUserByEmail(String email);
	public boolean existsByEmail(String email);
	

}
