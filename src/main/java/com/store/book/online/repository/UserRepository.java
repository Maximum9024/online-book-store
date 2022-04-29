package com.store.book.online.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.book.online.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
