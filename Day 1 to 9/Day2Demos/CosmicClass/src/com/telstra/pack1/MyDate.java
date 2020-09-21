package com.telstra.pack1;

public class MyDate {
	// POJO 
	private int dd;
	private int mm;
	private int yy;
	
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	

}
