package Utility;

public class Averageclass {
	//Java ... operator 
	public static double avg(double d,int ...num)
	{
		double  sum =d;
		
		for (int n:num)
		{
			sum+=n;
		}
		
		return (sum/(num.length+1));
	}

	
	public static double avg(int ...num)
	{
		double  sum =0.0;
		
		for (int n:num)
		{
			sum+=n;
		}
		System.out.println("Second function.....");
		
		return (sum/(num.length));
	}
}
