package com.initilization.block;

import java.util.Arrays;

public class Flight {

	private int flightNumber;
	private char flightClass;
	private int noOfSeats = 150;
	private boolean[] isSeatAvailable; 
	
	{
		isSeatAvailable = new boolean[noOfSeats];
		for(int i=0;i<noOfSeats;i++) {
			isSeatAvailable[i] = true;
		}
	}
	
	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Flight(int flightNumber, char flightClass) {
		this(flightNumber);
		this.flightClass = flightClass;
	}
	
	
}
