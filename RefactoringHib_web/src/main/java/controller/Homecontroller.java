package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;



public class Homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	List<Customer> customers=null;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service= new CustomerServiceImpl();
		customers = service.getAllCustomer();
		request.setAttribute("customers", customers);
		RequestDispatcher view = request.getRequestDispatcher("list_customer.jsp");
		view.forward(request, response);

}
}
