package com.timeBank;

import java.util.List;

public interface JobsServiceInterface {

	void insertJob(Jobs job);

	void deleteJob(int id);

	JobsInterface findById(int id);

	List<Jobs> findByEmail(User user);

	List<Jobs> findByCategory(String category);

}