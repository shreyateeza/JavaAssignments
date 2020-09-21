package com.telstra.mainpack;

import com.telstra.cpack.ClassA;
import com.telstra.ipack.Printable;
import com.telstra.ipack.Showable;

public class Main {

	public static void main(String[] args) {
		
		ClassA ob = new ClassA();
		
		ob.show();
		ob.print();
		
		Printable ob1 = new ClassA();
		
		ob1.print();
		
		Showable ob2 = new ClassA();
		
		ob2.show();
		

	}

}
