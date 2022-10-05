package com.bankV2;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account acc;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Account getAccount() {
		return this.acc;
	}
	
	public void setAccount(Account acc) {
		
		this.acc = acc;
	}

}
