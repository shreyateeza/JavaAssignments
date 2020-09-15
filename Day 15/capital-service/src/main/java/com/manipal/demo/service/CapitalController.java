package com.manipal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.ICapitalRepository;
import com.manipal.demo.model.Capital;

@RestController
@RequestMapping("/capital-service")
public class CapitalController {

	@Autowired
	ICapitalRepository repository;

	@GetMapping("/capital/{name}")
	public Capital getCapitalDetails(@PathVariable("name") String capitalName) {
		Capital capital  = (Capital) repository.findByName(capitalName);
		return capital;
	}
	
	@GetMapping("/capital/{zipcode}")
	public Capital getCapitalDetails(@PathVariable("zipcode") Long zipcode) {
		Capital capital  = (Capital) repository.findByZipcode(zipcode);
		return capital;
	}
		
}
