package com.telstra.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telstra.model.Telephone;

@Repository
public interface TelephoneRepository extends CrudRepository<Telephone, Long>{

	List<Telephone> findByCustomerId(Long customerId);
	
	
	
}
