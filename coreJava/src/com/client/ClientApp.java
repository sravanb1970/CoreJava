package com.client;

import com.constructors.examples.Account;

public class ClientApp {

	public ClientApp() {
		System.out.println("DB Established");
	}

	public static void main(String[] args) {
		ClientApp clientApp = new ClientApp();
		
		Account a = new Account("Manju", 8658, 21000);
			System.out.println(a.accountNameNew);
//		String accName, long phone, long accBalance
//		System.out.println(a.validateAccBalance(a.accBalance));
//		System.out.println(a.accBalance + " - current Balance");
			// System.out.println("Account created for " + a.accountName);
		}
	}

