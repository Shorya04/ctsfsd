package Spring.myCompany.SpringJDBC.Customer;

import java.sql.SQLException;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;

}
