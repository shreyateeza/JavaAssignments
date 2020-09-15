package com.telstra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.telstra.clients.TelephoneClient;
import com.telstra.exception.CustomerNotFoundException;
import com.telstra.model.Customer;
import com.telstra.model.Telephone;
import com.telstra.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerServiceController {

	@Autowired
	CustomerRepository repository;
	
	@Autowired
	TelephoneClient telephoneClient;
	
	@PostMapping("/savecustomerdetails")
	public String saveCustomerDetails(@RequestBody Customer customer) {
		repository.save(customer);
		return "The Customer details are successfully saved!";
	}
	
	@GetMapping("/getallcustomerdetails")
	public List<Customer> getAllCustomerDetails(){
		List<Customer> customerList = (List<Customer>) repository.findAll();
		return customerList;
	}
	
	@GetMapping("/getcustomerdetails/{id}")
	public Customer getCustomerDetails(@PathVariable("id") Long Id) {
		Customer customerId  = (Customer) repository.findById(Id).get();
		return customerId;
	}
	
	@PutMapping("/updatecustomeredetails")
	public String updateCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return "The customer details are updated!";
	}
	
	
	@DeleteMapping("/deletecustomerdetails/{id}")
	public String deleteCustomerDetails(@PathVariable("id") Long Id) {
		if(!repository.existsById(Id)) {
			throw new CustomerNotFoundException("Id not found");
		}
		repository.deleteById(Id);
		return "Customer details of "+Id+" deleted";
	}
	

	@GetMapping("/showtelephonedetails/{customerId}/telephone")
	public List<Telephone> getCustomerTelephoneDetails(@PathVariable("customerId") Long customerId) {
		// RestTemplate restTemplate = new RestTemplate();
		// restTemplate.exchange("http://localhost:8080/getcustomerid/" + customerId, HttpMethod.GET, null, Telephone.class);
		List<Telephone> telephoneList = telephoneClient.getCustomerTelephoneDetail(customerId);
		return telephoneList;
	}
	
	
}
