package com.timeBank;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface JobsRepositoryInterface {

	List<Jobs> findByEmail(User user);

	List<Jobs> findByCategory(String category);

}