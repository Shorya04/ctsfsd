package com.myCompany.New_JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import com.myCompany.Nw_JDBC.example.Customer;
import com.myCompany.Nw_JDBC.example.CustomerService;
import com.myCompany.Nw_JDBC.example.CustomerServiceImpl;

public class MyCustomerMain {
	
	private static CustomerService service;
	static
	{
		service=new CustomerServiceImpl();
	}
	public static void main(String[] args) throws IOException,SQLException,NumberFormatException {
		int choice=0;
		List<Customer> list=null;
		Customer customer=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Create customer");
			System.out.println("2. Display all customers");
			System.out.println("3. Insert id to find customer ");
			System.out.println("4. Update customer");
			System.out.println("5. Delete customers");
			System.out.println("0. Exit");
			System.out.println("Enter Choice: ");
		    choice=Integer.parseInt(br.readLine().toString());
		     
		    switch(choice) {
		    
		    case 1:
		    	System.out.println("First Name: ");
		    	String fname=br.readLine().toString();
		    	System.out.println("Last Name: ");
		    	String lname=br.readLine().toString();
		    	System.out.println("Email: ");
		    	String email=br.readLine().toString();
		    	String arr[]=UUID.randomUUID().toString().split("-");
		    	Customer customer1 =new Customer((arr[0]+arr[1]),fname,lname,email);
		    	customer=service.createCustomer(customer1);
		    	System.out.println("Customer Created!!"+customer);
		    	break;
		    	
		    case 2: 
		    	Customer c=list.get(0);
		        list=service.getAllCustomers();
		    	System.out.format("%-20s%-20s%-20s%-20s\n","UID","FIRST_NAME","LAST_NAME","EMAIL");
				list.forEach(i->{
				System.out.format("%-20s%-20s%-20s%-20s\n",c.getCustomerUID(),c.getFirst_name(),c.getLast_name(),c.getEmail());
				});
				break;
				
		    case 3:
		    	System.out.print(" UID: ");
				String uid=br.readLine().toString();
				list=service.findById(uid);
				if(list.isEmpty())
				{
					System.out.println("No UID found!!");
				}
				else {

					Customer c1=list.get(0);
					System.out.println("customer found: "+c1);
				}
				break;
				
		    case 4:
		    	System.out.print(" UID: ");
				String uid1=br.readLine().toString();
				list=service.findById(uid1);
				if(list.isEmpty())
				{
					System.out.println("No UID found!!");
				}
				else {
					Customer c2=list.get(0);
					System.out.println("First Name: ");
			    	String fname1=br.readLine().toString();
			    	System.out.println("Last Name: ");
			    	String lname1=br.readLine().toString();
			    	System.out.println("Email: ");
			    	String email1=br.readLine().toString();
			    	c2.setFirst_name(fname1);
			    	c2.setLast_name(lname1);
			    	c2.setEmail(email1);
			    	customer=service.updateCustomer(c2,c2.getCustomerUID());
					}
		    case 5: 
		    	
		    	
		    	
		    case 0:
		    	System.exit(0);
		    	
		    	default:
		    	System.out.println("Enter valid choice");
		    	break;
		    }
		    }
		while(choice!=0);
	}
}
			
		

			
			
		
	

	


