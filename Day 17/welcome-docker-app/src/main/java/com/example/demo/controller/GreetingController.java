package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
	@GetMapping
	public String greetAll() {
		return "Good Morning All";
	}
	
	@GetMapping("{name}")
	public String greetUser(@PathVariable String name) {
		return "Good Morning " + name;
	}
	
	
}
