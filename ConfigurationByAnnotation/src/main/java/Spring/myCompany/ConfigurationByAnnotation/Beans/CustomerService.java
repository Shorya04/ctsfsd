package Spring.myCompany.ConfigurationByAnnotation.Beans;

import java.sql.SQLException;
import java.util.List;


public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomer() throws SQLException;
	public List<Customer> findByUID(String customerUID) throws SQLException;

}
