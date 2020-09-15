package com.telstra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telstra.model.Customer;

@Repository 
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
}
