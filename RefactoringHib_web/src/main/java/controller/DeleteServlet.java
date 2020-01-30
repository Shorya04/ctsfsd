package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.dao.CustomerDaoImpl;
import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	
	public void init() throws ServletException{
		super.init();
		service= new CustomerServiceImpl();
	}
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer c=service.findById(Integer.parseInt(request.getParameter("id")));
		service.deleteCustomer(c);
		RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
		view.forward(request, response);
	}	

}
