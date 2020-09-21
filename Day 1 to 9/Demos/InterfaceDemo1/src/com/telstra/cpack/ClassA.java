package com.telstra.cpack;

import com.telstra.ipack.Printable;
import com.telstra.ipack.Showable;

public class ClassA implements Printable ,Showable{

	@Override
	public void show() {
		System.out.println("Welcome to Interface learning"+count);
		
	}

	@Override
	public void print() {
		
		System.out.println("Welcome to Java world......");
		
	}
	
	

}
