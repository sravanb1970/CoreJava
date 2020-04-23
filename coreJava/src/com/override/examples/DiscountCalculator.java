package com.override.examples;

public class DiscountCalculator {
	
	private int confidentialSerialNumber = 555;
	private String name;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getConfidentialSerialNumber() {
		return confidentialSerialNumber;
	}
	
	
	public void setConfidentialSerialNumber(int confidentialSerialNumber) {
		if(name.equals("TCS")) {
		this.confidentialSerialNumber = confidentialSerialNumber;
		}
		System.out.println("Value is " + this.confidentialSerialNumber);
	}

	
	
	public double calculateDiscount(int total) {
	System.out.println("Total Amount - " + total);
	int temp= total * 30; 
	int discount = temp /100;
	double discountedValue = total - discount;
	return discountedValue;
	
}




}
