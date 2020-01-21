package HIBERNATE.myCompany.Hibernate;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.Hibernate.Model.Person;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        	Session session=factory.openSession();
        	Person person=new Person(UUID.randomUUID().toString(),"abc");
        	session.getTransaction().begin();
        	session.save(person);
        	session.getTransaction().commit();
        	System.out.println("done");
        }
        catch (Exception e) {
			e.printStackTrace();
		}
    }
}
