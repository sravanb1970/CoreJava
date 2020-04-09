package com.constructors.examples;

public class Account {
	public String accountNameNew;
	public long phoneNew;
	public long accBalanceNew; 
	
	public Account(String accName, long phone, long accBalance) {
		if(accBalance >= 10000) {
			System.out.println("You are eligible to create an account");
			System.out.println("Account details - " +  accBalance + " for user - "+ accName);
			accountNameNew = accName; 
			phoneNew = phone;
			accBalanceNew = accBalance;
			}		
		else {
			System.out.println("Not eligible to create an account");
		}
	}
	
	/*
	 * public String validateAccBalance(long accBalance) { if(accBalance >=10000) {
	 * return "You are eligble to open account"; } return
	 * "You are not eligble to open account"; }
	 */
}
