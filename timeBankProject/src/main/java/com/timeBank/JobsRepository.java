package com.timeBank;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JobsRepository extends CrudRepository<Jobs,Integer>{
	
	@Query("select j from Jobs j where j.user = ?1")
    List<Jobs> findByEmail(User user);
	
	@Query("select j from Jobs j where j.category = ?1")
	List<Jobs>findByCategory(String category);

}