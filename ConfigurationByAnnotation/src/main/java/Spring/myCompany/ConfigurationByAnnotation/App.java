package Spring.myCompany.ConfigurationByAnnotation;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.support.xml.SqlXmlFeatureNotImplementedException;

import Spring.myCompany.ConfigurationByAnnotation.Beans.Customer;
import Spring.myCompany.ConfigurationByAnnotation.Beans.CustomerConfig;

public class App {
	
	public static void main( String[] args ) throws SQLException{
		
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
        Customer c=context.getBean("customer",Customer.class);
        c.setCustomerUID("101");
        c.setFirstName("Shorya");
        c.setLastName("Singh");
        c.setEmail("sora@email.com"); 
        System.out.println(c);
}
}
