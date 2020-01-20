package Spring.myCompany.ConfigurationByAnnotation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Spring.myCompany.ConfigurationByAnnotation.Beans.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {
	
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerUID(rs.getString("customerUID"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setEmail(rs.getString("email"));
		return customer;

	}
	

}
