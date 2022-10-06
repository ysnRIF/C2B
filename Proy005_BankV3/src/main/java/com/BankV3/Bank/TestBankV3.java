package com.BankV3.Bank;

//https://www.dropbox.com/scl/fo/nalf28w9vyohpz2312ijm/h?dl=0&rlkey=nfjgyp4194lwsszgcilx74uhq

public class TestBankV3 {
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		
		try {
			
			b.addCustomer("aa", "bb");
			b.addCustomer("cc", "dd");
			b.addCustomer("ee", "ff");
			
		} catch(Exception e) {
			System.out.println("ERROR !" + e.getMessage());
		}
		
		
		
		
		
		for(int i =0; i<b.getNumCustomers(); i++) {
			Customer c = b.getCustomer(i);
			System.out.println(c.toString());

		}
		
		System.out.println(b.getNumCustomers());
		
		
		
		
	}

}
