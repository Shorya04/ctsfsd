package Spring.myCompany.ConfigurationByAnnotation.Beans;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("service")
public class CustomerServiceImpl implements CustomerService {
		CustomerDao custDao;

		
		
		public CustomerServiceImpl(CustomerDao custDao) {
			super();
			this.custDao = custDao;
		}
		
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return custDao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() throws SQLException {
		// TODO Auto-generated method stub
		return custDao.getAllCustomer();
	}

	@Override
	public List<Customer> findByUID(String customerUID) throws SQLException {
		// TODO Auto-generated method stub
		return custDao.findByUID(customerUID);
	}
}
