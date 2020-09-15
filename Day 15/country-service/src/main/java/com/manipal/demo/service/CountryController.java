package com.manipal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.ICountryRepository;
import com.manipal.demo.model.Country;

public class CountryController {

	@Autowired
	ICountryRepository repository;

	@GetMapping("/country/{countryName}")
	public Country getCountryDetails(@PathVariable("countryName") String countryName) {
		Country country = (Country) repository.findByName(countryName);
		return country;
	}
	
}
