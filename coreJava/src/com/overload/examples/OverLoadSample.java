package com.overload.examples;

public class OverLoadSample {
	
	public String concatString(String s1, String s2) {
		return s1+s2;
	}
		
	public String concatString(String s1, String s2, String s3) {
		return s1+s2+s3;
	}
	
	
	public String concatString(String s1, String s2, String s3, String s4) {
		return s1+s2+s3+s4;
	}
	
	
	public int addNumbers(double a, int b) { //Method header //addNumbers(int a, int b) - Method signature 
		System.out.println("AddNumbers from double and int method");
		return (int) (b+a);
	}
	
	public int addNumbers(int a, int b) {
		System.out.println("AddNumbers from int and int method");
		return a+b;
	}
	
	public double addNumbers(double a, double b) {
		System.out.println("AddNumbers from double and double method");
		return a+b;		
	}
	
	public float addNumbers(float f1, float f2) {
		return f1+f2;
}
	
	//var args  datatype... argumentName
	public int addNumbers(int...args) {
		System.out.println("AddNumbers from var args method");
		int sum=0;
		for(int arg:args) {
			sum +=arg;
			
		}
		return sum;
		
	}

}
