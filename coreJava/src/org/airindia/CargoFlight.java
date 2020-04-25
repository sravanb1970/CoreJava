package org.airindia;

public class CargoFlight extends Flight{
	
	 private int noOfSeats = 12;
	private long dimensions; 
	private long speed;
	
	@Override
	public int getNoOfSeats() {
		System.out.println("From child cargo flight");
		return noOfSeats;
	}

	public long getDimensions() {
		return dimensions;
	}
	public void setDimensions(long dimensions) {
		this.dimensions = dimensions;
	}
	public long getSpeed() {
		return speed;
	}
	public void setSpeed(long speed) {
		this.speed = speed;
	} 
	
	
	

}
