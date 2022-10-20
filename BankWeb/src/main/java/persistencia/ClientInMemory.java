package persistencia;

import java.util.List;

import com.curso.Bank;
import com.curso.Customer;

public class ClientInMemory implements GenericDAO<Customer> {

	@Override
	public void add(Customer client) {
		
		Bank.addCustomer(client.getFirstName(), client.getLastName());
		
		
	}

	@Override
	public Customer[] getAll() {
		return Bank.getAll();
	}

	
	
	

}
