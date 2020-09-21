package com.telstra.pack1;

import java.util.Random;

public class Person {
  // Instance variables 
	// a variable can be made constant using final keyworkd
	private final int pId;
	private String pName;
	private int pAge;
	
	private static int count;
	
	static
	{
		count=0;
	}
	
	private  static int getCount()
	{
		//return(++count);
		Random rand = new Random();
		count = rand.nextInt(4000)+1000;// 1000 and 5000
		return count;
	}

	public Person(String pName, int pAge) {
		super();
		this.pId = getCount();
		this.pName = pName;
		this.pAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge
				+ "]";
	}
	
	
	
	
	
	
}
