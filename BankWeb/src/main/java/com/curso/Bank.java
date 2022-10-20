package com.curso;

import java.util.Collection;
import java.util.List;

public class Bank {
	  private static Customer[] customers;
	  private static int        numberOfCustomers;

	  //Create a static block with clients data 
	  static {
	    customers = new Customer[4];
	    customers[0] = new Customer("bob", "Sinclar");
	    customers[1] = new Customer("Luis", "Sanchez");
	    customers[2] = new Customer("Mariah", "Carry");
	    customers[3] = new Customer("bob", "Marley");
	    numberOfCustomers = 4;
	  }

	  private Bank() {
	    // this constructor should never be called
	  }

	  public static void addCustomer(String f, String l) {
	    int i = numberOfCustomers++;
	    customers[i] = new Customer(f, l);
	  }
	  public static int getNumOfCustomers() {
	    return numberOfCustomers;
	  }
	  public static Customer getCustomer(int customer_index) {
	    return customers[customer_index];
	  }
	  
	    
	  public static Customer[] getAll(){
		  //System.out.println(customers.length);
			return customers;
		}
	}
