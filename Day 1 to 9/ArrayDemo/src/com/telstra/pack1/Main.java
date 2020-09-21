package com.telstra.pack1;

public class Main {

	public static void main(String[] args) {
		
		int[] iarr = {72,44,16,58,37};// total memory allocated is 4X5 = 20 bytes 
		
		
		
		// why does the index value of an array start from 0;
		
		// to find min and max  element of an array
		
		int min = iarr[0];
		int max = iarr[0];
		
		for (int i=1;i<iarr.length;i++)
		{
			if (min>iarr[i])
				 min = iarr[i];
			
			if (max<iarr[i])
				 max = iarr[i];
		}
		
		System.out.println("Min: "+min+" Max:  "+max);
		
		
		int[] iarr1 = new int[10]; //array  reassignment
		iarr1 = iarr;
		
		// Enhanced for loop 
		// It iterates every element in the array
		// how does work:  first element is copied to temp variable n of same type and so on
		// it traverses till the end of the array
		for (int n: iarr1)
		{
			System.out.print(n+"   ");
		}
		
		/*double[] darr = {12.2,4.5,33.3,60.2};
		
		for(double t:darr)
		{
			System.out.println(t);
		}
		*/
		// to search for a element 
		double[] darr = {12.2,4.5,33.3,60.2};
		  double ele=133.3;
		  
		  System.out.println(darr[0]);
		  
		  changeitem( darr);
		  System.out.println(darr[0]);
		  
		  
			/*if (searchItem(darr,ele)== true)
				System.out.println("element is  found");
			else
				System.out.println(" element not found");*/
				 

	}
	
	/*public static boolean searchItem(double[] darr1,double ele)
	{
		boolean flag=false;
		// enhanced for loop
		for (double d:darr1)
		{
			if (ele==d)
			{
				 flag=true;
				 break;
			}
		}
		
		return flag;
	}*/
	
	public static void changeitem(double[] darr1)
	{
		darr1[0]=1000.5;
	}

}
