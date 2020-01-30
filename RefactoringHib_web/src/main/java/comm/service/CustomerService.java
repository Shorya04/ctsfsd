package comm.service;

import java.util.List;

import comm.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer findById(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
