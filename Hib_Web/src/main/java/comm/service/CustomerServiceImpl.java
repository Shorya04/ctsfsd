package comm.service;

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

}
