package Spring.myCompany.ConfigurationByAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring.myCompany.ConfigurationByAnnotation.Beans.Customer;
import Spring.myCompany.ConfigurationByAnnotation.Beans.CustomerService;


public class App {
		
		
	    public static void main( String[] args ) throws IOException, SQLException, NumberFormatException{
	    	
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	CustomerService service=null;
	    	try {
	    		
	        	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	        	service=context.getBean("service",CustomerService.class);
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
			
	    }
	   int choice=-1;
	   String customerUID,firstName,lastName,email=null;
	   do {
	   System.out.println("....Enter Choice....");
	   System.out.println("1.Create customer");
	   System.out.println("2.Display all customers");
	   System.out.println("3.Find Customer");
	   System.out.println("4.Update Customer");
	   System.out.println("5.Delete Customer");
	   System.out.println("0.Exit");
	   choice=Integer.parseInt(br.readLine());
	 
	   switch(choice) {
	   
	   case 1:
		   System.out.println("Firstname: ");
		   firstName=br.readLine();
		   System.out.println("Lastname: ");
		   lastName=br.readLine();
		   System.out.println("Email: ");
		   email=br.readLine();
		   String[] array=UUID.randomUUID().toString().split("-");
		   customerUID=array[0]+array[1];
		   service.createCustomer(new Customer(customerUID, firstName, lastName, email));
		   break;
		   
	   case 2:
		   List<Customer> list=service.getAllCustomer();
		   System.out.format("%-20s%-20s%-20s%-20s\n", "CustomerUID","FIRSTNAME","LASTNAME","EMAIL");
		   list.forEach(c->{
			   System.out.println(c);
		   });
			   break;
	   case 3:
		   System.out.println("Enter CustomerUID: ");
		   customerUID=br.readLine();
		   list=service.findByUID(customerUID);
		   if(list.isEmpty()) {
					System.out.println("Customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "CustomerUID","FIRSTNAME","LASTNAME","EMAIlL");
					list.forEach(c->{
						System.out.println(c);
					});
				}
		   break;
		   
	   case 4:
		   System.out.println("Enter CustomerUID: ");
		   customerUID=br.readLine();
		   list=service.findByUID(customerUID);
		   if(list.isEmpty()) {
					System.out.println("Customer not found");
				}
				else {
					
				}
		   
	   default:
		   System.out.println("Enter valid choice");
		   break;
	   }
	   }
	   while(choice!=0);
	   }
	}


