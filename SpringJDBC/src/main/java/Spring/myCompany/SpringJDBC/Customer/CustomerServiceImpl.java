package Spring.myCompany.SpringJDBC.Customer;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
 
	CustomerDao custDao;
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		return custDao.createCustomer(customer);
		
	}

}
