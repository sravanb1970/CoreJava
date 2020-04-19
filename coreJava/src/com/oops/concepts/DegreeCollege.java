package com.oops.concepts;

import java.util.Arrays;

public final class DegreeCollege extends College {

	public String[] depts;
	public int distanceFromCity;
	public int collegeTimings;

	public DegreeCollege() {
//		super(1,null);
		System.out.println("0 args from Degree college");
	}
	
	public DegreeCollege(int collegeId, String collegeName, int distanceFromCity) {
		super(collegeId, collegeName);
		this.collegeId = collegeId; 
		this.collegeName = collegeName;
		this.distanceFromCity = distanceFromCity;
	}
	
	public void displayCollegeDetails() {
		System.out.println("College Name - " + collegeName);
		System.out.println("College ID - " + collegeId);
		System.out.println("College Location - " + location);
		System.out.println("College strength - " + strength);
		System.out.println("depts - " + Arrays.toString(depts));
		System.out.println("Timings -  " + collegeTimings);
		System.out.println("distance from city- " + distanceFromCity);

	}

}
