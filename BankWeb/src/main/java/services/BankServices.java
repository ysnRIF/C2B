package services;
import com.curso.Bank;
import com.curso.Customer;

import persistencia.ClientInMemory;
import persistencia.GenericDAO;

public class BankServices {

	GenericDAO<Customer> dao = new ClientInMemory();

	public void addAClient(Customer c) {
		// valida que p no es null
		// validar descripcion
		// validar precio

		dao.add(c);

	}

	public Customer[] giveMeAllClients() {
		return Bank.getAll();
	}

}
