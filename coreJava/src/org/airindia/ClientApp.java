package org.airindia;

public class ClientApp {

	public static void main(String[] args) {

		Flight f = new Flight();
		System.out.println(f.getNoOfSeats());
		f.setNumberOfSeats(180, "airIndia");
		System.out.println(f.getNoOfSeats());
		System.out.println("--------------------------");

		CargoFlight cargoFlight = new CargoFlight();
		cargoFlight.setFlightNumber(456);
		cargoFlight.setSpeed(45);
		System.out.println(cargoFlight.getFlightNumber());
		System.out.println(cargoFlight.getNoOfSeats());
		System.out.println(cargoFlight.getSpeed());

		System.out.println("--------------------------");
		Flight Flight1 = new CargoFlight();
		System.out.println(Flight1.getNoOfSeats());

	}

}
