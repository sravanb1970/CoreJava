package com.construtorschaining;

public class FlightBaggage {

	
	private int freeBags;
	private int checkedBags;
	private double payForBag; 
	
	public FlightBaggage(int freeBags) {
		this(freeBags > 1 ? 2.5d:3.0d);
		this.freeBags = freeBags;
		System.out.println("Free Bags can be used while travelling");
	}
	
	
	public FlightBaggage(int freeBags, int checkedBags) {
		this(freeBags); //this helps to avoid duplicate code and if there is any logic for implementing in freeBags constructor that can be used 
		this.checkedBags = checkedBags;
	}
	
	private FlightBaggage(double payForBags) {
		this.payForBag = payForBags;
		System.out.println("Pay for bag: " + payForBags);
	}
	
	
}
