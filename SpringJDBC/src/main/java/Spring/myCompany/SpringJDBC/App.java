package Spring.myCompany.SpringJDBC;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.myCompany.SpringJDBC.Customer.Customer;
import Spring.myCompany.SpringJDBC.Customer.CustomerDao;

public class App 
{
    public static void main( String[] args ) 
    {
    	try {
			ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			CustomerDao custDao=context.getBean("dao",CustomerDao.class);
			Customer c=custDao.createCustomer(new Customer(UUID.randomUUID().toString(),"ABC",2000,"abc@gmail.com"));
			 System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
}
