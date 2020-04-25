package com.construtorschaining;

import com.initilization.block.Flight;

public class CargoFlight extends Flight{

	public int noOfSeats = 12;

	
	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public CargoFlight(int flightNumber) {
		super(flightNumber);
	}

	
	
	

}
