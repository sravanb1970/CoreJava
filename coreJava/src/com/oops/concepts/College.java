package com.oops.concepts;

import java.util.Arrays;

public class College {
	
	public int collegeId;
	public String collegeName;
	public String location;
	public int strength; 

	//1 - graduation - need location, distance from city 
	
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
