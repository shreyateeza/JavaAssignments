package com.telstra.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// array and arraylist
		ArrayList a1 = new ArrayList();// defaulted size = 10 
		
		a1.add(10);
		a1.add(15.4545);
		a1.add('c');
		a1.add("Java");
		
		System.out.println(a1);
		// Ordered List: the sequence in which elements added same sequence is followed for it output
		List<String>   a2 = new ArrayList<String>();
		
		a2.add("Meera");
		a2.add("Mythili");
		a2.add("Mahesh");
		
		
		System.out.println(a2);
		
		//works based on arrays
		a2.add(1, "Meena");
		System.out.println(a2);
		
		a2.remove(3);
		
		System.out.println(a2);
		
		ArrayList<String> subarr = new ArrayList<String>();
		subarr.add("one");
		subarr.add("two");
		a2.addAll(1, subarr);
		System.out.println(a2);
		System.out.println(a2.get(2));
		System.out.println();
		// to print an arraylist
		for (String str:a2)
		{
			System.out.print(str+"  ");
		}
		System.out.println();
		for(int i=0;i<a2.size();i++)
		{
			System.out.print(a2.get(i)+"  ");
		}
		System.out.println();
		// Printing using Iterator class
		Iterator<String>  it = a2.iterator();
		//String res="start";
		while(it.hasNext())
		{
			
			System.out.print(it.next());
		}
		
		
			

	}

}
