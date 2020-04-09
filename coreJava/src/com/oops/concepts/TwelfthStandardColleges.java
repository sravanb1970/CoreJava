package com.oops.concepts;

import java.util.Arrays;

public class TwelfthStandardColleges extends College {

	public String[] courses;
	public int noOfHoursForEachClass;
	public int timings;
	
	public void getTwelfthStandardCollegeDetails() {
		System.out.println("College Name - " + collegeName);
		System.out.println("College ID - " + collegeId);
		System.out.println("College Location - " + location);
		System.out.println("College strength - " + strength);
		System.out.println("Available courses - " + Arrays.toString(courses));
		System.out.println("Timings -  " + timings);
		System.out.println("Number of hours for each class - " + noOfHoursForEachClass);

	}


}
