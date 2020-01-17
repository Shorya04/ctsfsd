package com.myCompany.Nw_JDBC.example;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
 public Customer createCustomer(Customer customer) throws SQLException;
 public List<Customer> findById(String customerUID) throws SQLException;
 public List<Customer> getAllCustomers() throws SQLException;
 public Customer updateCustomer(Customer customer,String customerUID) throws SQLException;
 //public void deleteCustomer(String CustomerUID);
}
