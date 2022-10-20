package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.Customer;

import services.BankServices;


public class ListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BankServices service = new BankServices();
		Customer[] lista = service.giveMeAllClients();
		
		// añadir el atributo lista con todos los clients  a la request
		request.setAttribute("lista", lista);
		
		// despachar la peticion a lista-productos.jsp
		RequestDispatcher rd = request.getRequestDispatcher("customer-list.jsp");
		rd.forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}



}
