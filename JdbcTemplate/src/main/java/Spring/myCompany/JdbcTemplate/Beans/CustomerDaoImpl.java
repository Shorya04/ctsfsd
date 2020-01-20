package Spring.myCompany.JdbcTemplate.Beans;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbccTemplate(JdbcTemplate jdbccTemplate) {
		this.jdbcTemplate = jdbccTemplate;
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		String query="insert into customer(customerUID,firstName,LastName,email) values(?,?,?,?)";
		jdbcTemplate.update(query,new Object[] {customer.getCustomerUID(), customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		// TODO Auto-generated method stub
		return customer;
	}

	
	@Override
	public List<Customer> getAllCustomer() throws SQLException{
		// TODO Auto-generated method stub
		String query="select customerId,firtname,lastname,email from customer";
		return jdbcTemplate.query(query,new CustomerRowMapper());
	}
	@Override
	public List<Customer> findByUID(String customerUID) throws SQLException {
		String query="select customerId,firtname,lastname,email from customer where customerUID=? ";
		return jdbcTemplate.query(query, new Object [] {customerUID}, new CustomerRowMapper());
	}
	
	

}
