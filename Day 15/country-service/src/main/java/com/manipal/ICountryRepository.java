package com.manipal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Country;

@Repository
public interface ICountryRepository extends CrudRepository<Country, String>{

	Country findByName(String countryName);
	Country findByZipcode(Long zipcode);

}
