package com.telstra.cpack;

public class Consumer {
	
	 private int mtNo; // no access specifiers 
	private int unitConsumed;
	private int unitPrice;
	private   String  cName;
	
	public Consumer(int mtNo, int unitConsumed, int unitPrice) {
		super();
		this.mtNo = mtNo;
		this.unitConsumed = unitConsumed;
		this.unitPrice = unitPrice;
	}
	
	private int calcBill()
	{
		return(unitConsumed*unitPrice);
	}

	@Override
	public String toString() {
		return "Consumer [mtNo=" + mtNo + ", unitConsumed=" + unitConsumed
				+ ", unitPrice=" + unitPrice + "     Bill amt:   "+ calcBill()+"]";
	}
	
	
	

}
