package com.timeBank;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public Iterable<User> findAll() {

		return repository.findAll();

	}
	
	public void insertUser(User user) {
		repository.save(user);
	}
	
	public void deleteUser(String id) {
		Optional<User> user = repository.findById(id);
		
		repository.delete(user.get());
	}
	
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.get();

	}
	
	public boolean emailExist(String id) {
		Optional<User>user = repository.findById(id);
		if (user.isPresent()) {
			return true;
		} 
			return false;
	}
}
