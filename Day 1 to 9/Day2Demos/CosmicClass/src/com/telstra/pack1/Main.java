package com.telstra.pack1;

public class Main {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate(24,8,2020);
		MyDate d2 = new MyDate(24,8,2020);
		
		// == 
		
		System.out.println(d1==d2);
		
		// equals
		System.out.println(d1.equals(d2));
		
		String str1 = "goodDay";
		String str2 = "goodDay";
		
		System.out.println(str1==str2);

	}

}
