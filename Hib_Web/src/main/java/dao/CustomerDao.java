package dao;

import java.util.List;

import comm.model.Customer;

public interface CustomerDao {
	
	public Customer cretateCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
