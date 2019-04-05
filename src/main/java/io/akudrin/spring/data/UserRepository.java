package io.akudrin.spring.data;

import org.springframework.data.repository.CrudRepository;

import io.akudrin.spring.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}