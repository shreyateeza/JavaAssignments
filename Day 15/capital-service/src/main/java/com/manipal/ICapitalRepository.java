package com.manipal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Capital;

@Repository
public interface ICapitalRepository extends CrudRepository<Capital, String> {
	
	public Capital findByName(String name);
	public Capital findByZipcode(Long zipcode);
	
}
