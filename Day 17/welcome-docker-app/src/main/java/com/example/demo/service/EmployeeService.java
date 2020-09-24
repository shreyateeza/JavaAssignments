package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
}
