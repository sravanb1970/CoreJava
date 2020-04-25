package com.construtorschaining;

import com.initilization.block.Flight;

public class ClientApp {
	
	public static void main(String[] args) {
		FlightBaggage flight = new FlightBaggage(4);
		
		Flight f = new Flight(456);
		System.out.println(f.noOfSeats); //gives 150
		
		CargoFlight cargoFlight = new CargoFlight(565);
		System.out.println(cargoFlight.noOfSeats); // gives 12
		
		Flight f2 = new CargoFlight(565);
		System.out.println(f2.noOfSeats); // gives 150 because it is data hiding and when we give variable name it takes from parent class
		 								  // but when we give method name it takes from child class
		
		Flight f3 = new CargoFlight(565);
		System.out.println(f3.getNoOfSeats());//this method will be called from child class so we get 12 here as no of seats 
		
		
	}

}
