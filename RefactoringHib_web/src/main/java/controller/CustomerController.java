package controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service=new CustomerServiceImpl();
		
	}
       
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		Customer customer=new Customer(UUID.randomUUID().toString(),firstname, lastname, email);
		Customer c=service.createCustomer(customer);
		if(customer!=null)
		{
			List<Customer> list=service.getAllCustomer();
			request.setAttribute("SUCCESS", list);
			RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	

		
	}
	}
