package Spring.myCompany.JdbcTemplate.Beans;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomer() throws SQLException;
	public List<Customer> findByUID(String customerUID) throws SQLException;
}
