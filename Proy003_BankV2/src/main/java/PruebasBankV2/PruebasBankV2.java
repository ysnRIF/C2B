package PruebasBankV2;
import com.bankV2.Customer;
import com.bankV2.Account;

public class PruebasBankV2 {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Luis", "Ramos");
		Account a1 = new Account(500);
		
		
		
		try {
			a1.withdraw(650);
			
			//System.out.println("Ingreso de dinero 22.50");
			//a1.deposit(22.50);
			
			//a1.withdraw(47.62);
			
			//a1.withdraw(400);
			
			
		}catch(Exception e) {
			System.out.println("No tienes dinero Amigo !");
		}
		
	}
}
