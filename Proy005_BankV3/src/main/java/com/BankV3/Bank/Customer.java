package com.BankV3.Bank;

public class Customer {
	
	private String firstname;
	private String lastname;
	private Account acc;
	
	public Customer(String firstname, String lastname, Account acc) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.acc = acc;
	}
	
	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", acc=" + acc + "]";
	}
	
	
	
	

}
