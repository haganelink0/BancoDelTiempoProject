package com.timeBank;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService implements JobsServiceInterface {
	
	@Autowired
	JobsRepository repository;
	
	public Iterable<Jobs> findAll() {
		return repository.findAll();
	}
	
	@Override
	public void insertJob(Jobs job) {
		repository.save(job);
	}
	
	@Override
	public void deleteJob(int id) {
		Optional<Jobs> job = repository.findById(id);
		Jobs jobSelected = job.get();
		repository.delete(jobSelected);
	}
	
	@Override
	public JobsInterface findById(int id) {
		Optional<Jobs> job = repository.findById(id);
		return job.get();
	}
	
	 @Override
	public List<Jobs> findByEmail(User user) {
		 
		 List<Jobs> jobs = (List<Jobs>)repository.findByEmail(user);

		 return jobs;
	 }
	 
	 @Override
	public List<Jobs> findByCategory(String category) {
		 List<Jobs> jobs = (List<Jobs>)repository.findByCategory(category);
		 return jobs;
	 }
	 
	 
	

}

