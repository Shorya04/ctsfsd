package comm.service;

import java.util.List;

import comm.model.Customer;
import dao.CustomerDao;
import dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao= new CustomerDaoImpl();
	}
	@Override
	public Customer cretateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.cretateCustomer(customer);
		return customer;
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
