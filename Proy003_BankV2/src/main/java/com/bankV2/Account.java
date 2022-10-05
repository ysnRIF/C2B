package com.bankV2;

public class Account {
	
	private double Balance;

	public Account(double initBalance) {
		this.Balance = initBalance;
	}
	
	public double getBalance() {
		return this.Balance;
	}
	
	public boolean deposit(double amt) {
		
		boolean flag = false; 
		if(amt > 0) {
			this.Balance = Balance + amt;
			flag = true;
			//System.out.printf("has ingresado dinero de tu cuenta tu saldo es %f  %n",getBalance());
		}else {
			System.out.println("Eso no es un deposito valido !!");
		}
		return flag;
	}
	
	public boolean withdraw(double amt) {
		boolean flag = false; 
				
		if(amt <= this.Balance) {
			this.Balance = Balance - amt;
			flag = true;
			//System.out.printf("has sacado dinero de tu cuenta tu saldo es %f  %n",getBalance());
		}else {
			System.out.println("No tienes suficiente SALDO !!");
		}
		return flag;
	}

}
