package com.techie;

public class DiscountService {

	public String getDiscount(int amount) {
		String discountpercentage ="";
		if(amount>5000&&amount<10000) {
			discountpercentage="10%";
			
		}
		else if(amount>10000) {
			discountpercentage="15%";
		}
		return discountpercentage;
	}
	
}
