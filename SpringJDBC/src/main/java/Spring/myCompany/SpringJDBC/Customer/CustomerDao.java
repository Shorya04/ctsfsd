package Spring.myCompany.SpringJDBC.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers(); 
	public Customer findById(String customerUID);

}
