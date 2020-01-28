package controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.model.CustomerDto;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;
import mapper.CustomerDtoImpl;
import mapper.CustomerMapper;


public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	private CustomerDtoImpl impl;
       
  
  @Override
		public void init() throws ServletException {
			
			super.init();
			service=new CustomerServiceImpl();
			impl=new CustomerMapper();
		}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		//CustomerDTOImpl impl = null;
		CustomerDto dto=new CustomerDto(UUID.randomUUID().toString(),firstname, lastname, email);
		Customer customer=service.cretateCustomer(impl.customerDtotoCustomer(dto));
		if(customer!=null)
		{
			List<Customer> list=service.getAllCustomer();
			request.setAttribute("SUCCESS", list);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	

		
	}

}
