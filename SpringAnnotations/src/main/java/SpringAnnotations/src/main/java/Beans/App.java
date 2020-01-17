package SpringAnnotations.src.main.java.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	       Employee employee=context.getBean("employee",Employee.class);
    	       Address address=context.getBean("address",Address.class);
    	       address.setAddressLine1("UttarPradesh");
    	       address.setAddressLine2("India");
    	       address.setPhoneNumber("122332");
    	       address.setPincode("22525");
    	       employee.setAddress(address);
    	       System.out.println(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		
       
    }
    }}
