package HIBERNATE.myCompany.Spring_Hibernate;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import HIBERNATE.myCompany.Spring_Hibernate.Entity.User;

public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService service=context.getBean("service",UserService.class);
        User user=new User(UUID.randomUUID().toString(),"shorya","abc@gmail.com");
        service.createUserDetails(user);
        System.out.println(user);
        
        
        
        
    }
}
