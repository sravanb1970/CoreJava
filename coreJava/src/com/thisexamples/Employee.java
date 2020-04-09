package com.thisexamples;

public class Employee {

	public String empName;
	public String deptName;
	public double salary;

	public Employee() {
		System.out.println("Employee object created");
		this.empName = "Test";
		this.deptName = "Logistics";
		this.salary = 4000;
		
	}
	


	public Employee(String empName) {		
		this(); //Employee();		
		System.out.println("Employee with name constructor called - "+ empName);
		this.empName = empName;
	}



	public Employee(String empName, String deptName, double salary) {
		System.out.println("Employee created with Name - " + empName);
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
//			Employee.empCode = 54;			
	}

	public void printEmployeeData() {
		if(empName != null && deptName != null) {
		System.out.println("Employee Name - " + empName.toUpperCase());
		System.out.println("Department Name - " + deptName.toUpperCase());
		System.out.println("Employee salary - " + salary);
		System.out.println("saved in db");
		}
	}

}
