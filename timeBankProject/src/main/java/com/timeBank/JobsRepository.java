package com.timeBank;

import org.springframework.data.repository.CrudRepository;

public interface JobsRepository extends CrudRepository<Jobs,Integer>, JobsRepositoryInterface{

}