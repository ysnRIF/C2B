package persistencia;

import java.util.List;

import com.curso.Customer;

public interface GenericDAO<T> {
	
	public void add(T entidad);
	public Customer[] getAll();

}
