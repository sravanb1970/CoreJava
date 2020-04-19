package com.oops.concepts;

import java.util.Arrays;

public class College extends School{
	
	public int collegeId;
	public String collegeName;
	public String location;
	public int strength; 
	public static int number;

	public College() {
	 	number++;
	 	System.out.println("Number is - " + number);
		System.out.println("College class created internally");
	}
	
	public College(int collegeId, String collegeName) {
	 	number++;
	 	System.out.println("Number is - " + number);
		System.out.println("College class created internally");
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		
	}

	//1 - graduation - need location, distance from city 
	
	
	public void sampleMethod() {
		System.out.println("College Name is - " + collegeName);
	}
//1 - inheritance  
	public void getCollegeDetails() {
		System.out.println("College Name - " + collegeName);
		System.out.println("College ID - " + collegeId);
		System.out.println("College Location - " + location);
		System.out.println("College strength - " + strength);
//		System.out.println("Available courses - " + Arrays.toString(courses));
//		System.out.println("Timings -  " + timings);
//		System.out.println("Number of hours for each class - " + noOfHoursForEachClass);

	}

	
}
