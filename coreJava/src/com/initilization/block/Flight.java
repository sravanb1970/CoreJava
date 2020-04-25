package com.initilization.block;

import java.util.Arrays;

import com.construtorschaining.Passenger;

public class Flight {

	private int flightNumber;
	private char flightClass;
	public int noOfSeats = 150;
	private boolean[] isSeatAvailable;
	private int passengers;

	{
		isSeatAvailable = new boolean[noOfSeats];
		for (int i = 0; i < noOfSeats; i++) {
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

	public void add1Passenger(Passenger p) {
		if (hasSeating())
			passengers += 1;
		else
			handleTooMany();

	}

	public boolean hasSeating() {
		return passengers < noOfSeats;

	}

	public void handleTooMany() {
		System.out.println("No seats available");
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}
