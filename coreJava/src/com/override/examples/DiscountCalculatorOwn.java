package com.override.examples;

public class DiscountCalculatorOwn extends DiscountCalculator{
	
	public double calculateDiscount(int total) {
		System.out.println("Total Amount - " + total);
		int temp= total * 15; 
		int discount = temp /100;
		double discountedValue = total - discount;
		return discountedValue;			
	}

	//Encapsulation - 

}
