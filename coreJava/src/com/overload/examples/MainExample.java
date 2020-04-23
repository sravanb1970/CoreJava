package com.overload.examples;

public class MainExample {
	
	public static void main(String[] args) {
		OverLoadSample overLoadSample = new OverLoadSample();
//		System.out.println(overLoadSample.concatString("abc", "def"));
//		System.out.println(overLoadSample.concatString("abc", "def","ghi"));
//		System.out.println(overLoadSample.concatString("abc", "def","ghi","jkl"));
//		System.out.println(overLoadSample.addNumbers(5.0d, 45));
//		System.out.println(overLoadSample.addNumbers(5.0d,20.0d));
//		System.out.println(overLoadSample.addNumbers(45,45));
//		System.out.println(overLoadSample.addNumbers(65f,65f));
//		System.out.println("var args total - " + overLoadSample.addNumbers(65,58));
//		
		
		OverLoadSample child1 = new Child1();
		
		System.out.println(child1.addNumbers(45d,54d));
		
		
	}

}
