package com.timeBank;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService {
	
	@Autowired
	JobsRepository repository;
	
	public Iterable<Jobs> findAll() {
		return repository.findAll();
	}
	
	public void insertJob(Jobs job) {
		repository.save(job);
	}
	
	public void deleteJob(int id) {
		Optional<Jobs> job = repository.findById(id);
		Jobs jobSelected = job.get();
		repository.delete(jobSelected);
	}
	
	public Jobs findById(int id) {
		Optional<Jobs> job = repository.findById(id);
		return job.get();
	}
	
	 public List<Jobs> findByEmail(User user) {
		 
		 List<Jobs> jobs = (List<Jobs>)repository.findByEmail(user);

		 return jobs;
	 }
	 
	 public List<Jobs> findByCategory(String category) {
		 List<Jobs> jobs = (List<Jobs>)repository.findByCategory(category);
		 return jobs;
	 }
	 
	 
	

}

