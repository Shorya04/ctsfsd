package comm.service;

import java.util.List;

import comm.model.Customer;

public interface CustomerService {
	public Customer cretateCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
