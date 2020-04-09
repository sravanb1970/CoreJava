package com.thisexamples;

public class Addition {

	public int n;

	public Addition() {
		this(5);// Addition(5,5)
		System.out.println("No-arg called");

	}

	public Addition(int n) {
		this(n,5);	
		System.out.println("1-arg called");
	}

	public Addition(int n, int m) {
		System.out.println("Param constructor called");
		System.out.println(n +m);
	}

}
