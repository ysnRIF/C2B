package com.bankV2;
import com.bankV2.Customer;
import java.util.ArrayList;


public class Bank {
	
	private Customer[] costumersListe;
	private int numCostumers;
	
	
	public Bank(Customer[] costumersListe, int numCostumers) {
		this.costumersListe = costumersListe;
		this.numCostumers = numCostumers;
	}
	
	
	public Customer[] getCostumersListe() {
		return costumersListe;
	}


	public int getNumCostumers() {
		return numCostumers;
	}

	public void addCostumers(String fn, String ln, Account acc) {
		
		this.costumersListe.add(new Customer(fn, ln, acc));
		
	}
	
	public Customer getCustomer(int index) {
		
	}
	
	

	
	
	

}
