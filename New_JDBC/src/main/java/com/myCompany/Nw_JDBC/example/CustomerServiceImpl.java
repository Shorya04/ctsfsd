package com.myCompany.Nw_JDBC.example;
import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
	
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> findById(String customerUID) throws SQLException {
		return dao.findById(customerUID);
	}
	@Override
	public Customer updateCustomer(Customer customer, String customerUID) throws SQLException {
		
		return dao.updateCustomer(customer, customerUID);
	}

	
}

