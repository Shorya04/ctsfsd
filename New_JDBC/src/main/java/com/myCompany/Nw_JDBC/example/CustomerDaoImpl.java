package com.myCompany.Nw_JDBC.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class CustomerDaoImpl implements CustomerDao {

	private H2Connection myH2=null;
	private Connection connection=null;
	private Statement statement=null;
	PreparedStatement ps=null;
	List<Customer> list=null;
	private Customer customer=null;
	{
		myH2=H2Connection.getMyH2ConnectionObject();
		try {
			connection=myH2.getConnection();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
	
		ps=connection.prepareStatement("insert into customer(customerUID,firstname,lastname,email) values(?,?,?,?)");
		ps.setString(1, customer.getCustomerUID());
		ps.setString(2,customer.getFirst_name());
		ps.setString(3, customer.getLast_name());
		ps.setString(4, customer.getEmail());
		ps.executeUpdate();
		return customer;
	}
	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		statement=connection.createStatement();
	ResultSet res=statement.executeQuery("Select customerUID,firstname,lastname,email from customers");
		while(res.next())	 {
			list.add(new Customer(res.getString("customerUID"),res.getString("first_name"),
					res.getString("last_name"),
				res.getString("email")));
		}
			return list;
		}
	@Override
	public List<Customer> findById(String customerUID) throws SQLException{
		ps=connection.prepareStatement("select customerUID,firstname,lastname,email from customer where customerUID=?");
	    ps.setString(1, customerUID);
	    ResultSet res=ps.executeQuery();
	    List<Customer> list=new ArrayList<Customer>();
	    while(res.next()) {
	    	Customer customer=new Customer(res.getString("customerUID"),res.getString("first_name"),
					res.getString("last_name"),
				res.getString("email"));
	    	list.add(customer);
		}
			return list;
		}
	@Override
	public Customer updateCustomer(Customer customer,String customerUID) throws SQLException {
		ps=connection.prepareStatement("update customer set first_name=? set last_name=? set email=? where customerUID=?");
		ps.setString(1, customer.getFirst_name());
		ps.setString(2,customer.getLast_name());
		ps.setString(3,customer.getEmail());
		ps.setString(4, customerUID);
		ps.executeUpdate();
		return customer;
	}
	
	    
		
		
		
	}
		
	
	
	

