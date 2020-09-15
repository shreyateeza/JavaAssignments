package com.telstra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.exception.TelephoneNotFoundException;
import com.telstra.model.Telephone;
import com.telstra.repository.TelephoneRepository;

@RestController
@RequestMapping("/telephone")
public class TelephoneServiceController {

	@Autowired
	TelephoneRepository repository;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@PostMapping("/savetelephonedetails")
	public String saveTelephoneDetails(@RequestBody Telephone telephone) {
		repository.save(telephone);
		return "Your telephone details are successfully saved!";
	}
	
	@GetMapping("/getalltelephonedetails")
	public List<Telephone> getAllTelephoneDetails(){
		List<Telephone> telephoneList = (List<Telephone>) repository.findAll();
		return telephoneList;
	}
	
	@GetMapping("/gettelephonedetails/{id}")
	public Telephone getTelephoneDetails(@PathVariable("id") Long Id) {
		Telephone telephoneId  = (Telephone) repository.findById(Id).get();
		return telephoneId;
	}
	
	
	@PutMapping("/updatetelephonedetails")
	public String updateTelephone(@RequestBody Telephone telephone) {
		repository.save(telephone);
		return "Your telephone details are updated!";
	}
	
	
	@DeleteMapping("/deletetelephonedetails/{id}")
	public String deleteTelephoneDetails(@PathVariable("id") Long Id) {
		if(!repository.existsById(Id)) {
			throw new TelephoneNotFoundException("Id not found");
		}
		repository.deleteById(Id);
		return "Telephone details of "+Id+" deleted";
	}	
	
	@GetMapping("/getcustomerid/{customerId}")
	public List<Telephone> getCustomerId(@PathVariable("customerId") Long customerId) {
		
		List<Telephone> telephoneList = repository.findByCustomerId(customerId);
		return telephoneList;
		
	}
	
}
