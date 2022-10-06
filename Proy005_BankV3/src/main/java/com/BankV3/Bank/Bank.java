package com.BankV3.Bank;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Bank {
	
	private Customer[] customerListe;
	private int numCustomers;
	
	
	public Bank() {
		super();
		this.customerListe = new Customer[8];
		this.numCustomers = numCustomers;
	}


	public int getNumCustomers() {
		return numCustomers;
	}
	
	public void addCustomer(String fn, String ln) {
		
		if(fn == null || ln == null) {
			throw new RuntimeException("nombre o appelido falso !!");			
		}
		Customer c = new Customer(fn, ln);
		Account a = new Account(0.0);
		c.setAcc(a);
		this.customerListe[this.numCustomers] = c;
		this.numCustomers++;
		
	}
	
	public Customer getCustomer(int index) {
		
		if(customerListe[index] == null) {
			throw new RuntimeException("no existe el cliente !!");
		}
		
		
		return customerListe[index];
		
		
	}
	

}
