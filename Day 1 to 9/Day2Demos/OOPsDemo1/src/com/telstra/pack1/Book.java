package com.telstra.pack1;

public class Book { 
	// Description of the entity is called the data memeber/ instance varaible 
	// Every instance is given memory space to hold its state.
	private int bId;
	private String bName;
	private int bPrice;
	//special method  which going to construct instances 
	
	// Same name of the class 
	// This method will not return any value
	public Book(int bId, String bName, int bPrice) {
		super();// related with the concept of Inheritance in Java  
		         // invoking the constuctor of the object class 
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
		
	}

	// Root class : Object class  :  toString()
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice
				+ "]";
	}

	
	
	
	
	
	
	
	

}
