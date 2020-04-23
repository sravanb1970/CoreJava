package com.override.examples;

import java.util.Scanner;

public class ShoppingCart {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Enter the final amount");
	//	int amount = s.nextInt();
		DiscountCalculatorOwn discountCalculator = new DiscountCalculatorOwn();
		discountCalculator.setName("TCS");
		discountCalculator.setConfidentialSerialNumber(656);

//	System.out.println("Discounted Value is - " +	discountCalculator.calculateDiscount(amount));
		
	}

}
