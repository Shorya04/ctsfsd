package Spring.myCompany.JdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.myCompany.JdbcTemplate.Beans.Customer;
import Spring.myCompany.JdbcTemplate.Beans.CustomerService;
public class App 
{
	CustomerService service;
	
    public static void main( String[] args ) throws IOException, SQLException, NumberFormatException{
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	CustomerService service=null;
    	try {
    		
        	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
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
   default:
	   System.out.println("Enter valid choice");
	   break;
   }
   }
   while(choice!=0);
   }
}