package comm.dao;

import java.util.List;

import comm.model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
    public Customer findById(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
