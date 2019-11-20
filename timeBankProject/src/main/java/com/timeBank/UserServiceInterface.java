package com.timeBank;

public interface UserServiceInterface {

	void insertUser(User user);

	void deleteUser(String id);

	User findById(String id);

	boolean emailExist(String id);

}