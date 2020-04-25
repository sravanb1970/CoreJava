package org.airindia;

/*
 * @Author:  Boeing 
 */
public class Flight {

	private char flightClass;
	private int flightNumber;
	public int noOfSeats = 150;
	private int allowedBags;

	public void setNumberOfSeats(int number, String company) {
		if (company.equals("airIndia")) {
			this.noOfSeats = number;
		}
	}

	public int getNoOfSeats() {
		return this.noOfSeats;
	}

	public char getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(char flightClass) {
		this.flightClass = flightClass;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getAllowedBags() {
		return allowedBags;
	}

	public void setAllowedBags(int allowedBags) {
		this.allowedBags = allowedBags;
	}

}
