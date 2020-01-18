package Spring.myCompany.SpringJDBC.Customer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	
	private DataSource datasource;
	Connection connection=null;
	PreparedStatement ps=null;
    private static Logger logger=Logger.getLogger("Spring.myCompany.SpringJDBC.Customer.CustomerDaoImpl");
    
    @Autowired
	public CustomerDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
    @PostConstruct
    public void init() {
    	try {
    		logger.info("Creating connection..");
    		connection=datasource.getConnection();
    		logger.info("Connection Establishe");
			}
    	catch (Exception e) {
			e.printStackTrace();
		}
    }

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		ps=connection.prepareStatement("insert into customer(CustomerUID,CustomerName,Salary,email) values(?,?,?,?)");
		ps.setString(1,customer.getCustomerUID());
		ps.setString(2,customer.getCustomerName());
		ps.setDouble(3, customer.getSalary());
		ps.setString(4,customer.getEmail());
		ps.executeUpdate();
        return customer; 
	}

}
