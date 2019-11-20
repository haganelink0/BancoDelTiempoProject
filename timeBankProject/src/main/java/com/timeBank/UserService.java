package com.timeBank;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepository repository;

	public Iterable<User> findAll() {

		return repository.findAll();

	}
	
	@Override
	public void insertUser(User user) {
		repository.save(user);
	}
	
	@Override
	public void deleteUser(String id) {
		Optional<User> user = repository.findById(id);
		
		repository.delete(user.get());
	}
	
	@Override
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.get();

	}
	
	@Override
	public boolean emailExist(String id) {
		Optional<User>user = repository.findById(id);
		if (user.isPresent()) {
			return true;
		} 
			return false;
	}
}
