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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yy;
		return (dd^mm^yy);
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yy != other.yy)
			return false;
		return true;*/
		
		MyDate d = (MyDate)obj;
		if((dd==d.dd)&&(mm==d.mm)&&(yy==d.yy))
			return true;
			else return false;
	}
	
	

}
