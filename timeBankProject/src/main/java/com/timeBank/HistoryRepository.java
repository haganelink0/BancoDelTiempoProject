//package com.timeBank;
//
//import java.util.List;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;
//
//public interface HistoryRepository extends CrudRepository<History, Integer> {
//	
//	@Query("select h from History h where h.alphauser = ?1")
//	List<History> findByAlphaUser(User user);
//	
//	@Query("select h from History h where h.betauser =?1")
//	List<History> findbyBetaUser(User user);
//
//}
