package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	@GetMapping("{id}")
	public Employee getEmployee(@PathVariable int id){
		return employeeService.getEmployeById(id);
	}
	
	@PostMapping
	public String addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);;
		return "Employee Added";
	}
}
