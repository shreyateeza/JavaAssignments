package com.manipal.spring_core_demo3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private long empId;
	private String empName; 
	private double salary;
	private Address	address;
	
	
	
	//@Autowired
	public Employee(long empId, String empName, double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	} 
	
	@Autowired
	@Qualifier("address2")
	public void provideAddress(Address address) {
		System.out.println("provideAddress method running....");
		this.address = address;
	}
	
	
}
