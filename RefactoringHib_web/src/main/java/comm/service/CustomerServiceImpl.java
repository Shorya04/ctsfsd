package comm.service;

import java.util.List;

import comm.dao.CustomerDao;
import comm.dao.CustomerDaoImpl;
import comm.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.deleteCustomer(customer);
		
	}

}
