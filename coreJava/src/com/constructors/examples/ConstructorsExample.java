package com.constructors.examples;

public class ConstructorsExample {
	
	public ConstructorsExample() {
		System.out.println("Constructor called");
	}


	//constructors will take care of creating an object when a new keyword is used while creating an object 
	//like String s = new String();
	//Constructor rules - 
	// 1 - constructors doesn't have return types 
	//2 - Constructor name must be same as class name 
	//3 - constructor will be executed before executing any methods 
	//4 - when we are not defining a constructor, compiler will create a default constructor with no arguments 
	
	public static void main(String[] args) {
		ConstructorsExample constructorsExample = new ConstructorsExample();//object creation statement 
		System.out.println("completed");
	}
	
}
