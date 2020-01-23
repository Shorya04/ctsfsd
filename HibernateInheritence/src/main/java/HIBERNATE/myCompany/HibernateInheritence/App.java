package HIBERNATE.myCompany.HibernateInheritence;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.HibernateInheritence.Entity.ContractualEmployee;
import HIBERNATE.myCompany.HibernateInheritence.Entity.Employee;
import HIBERNATE.myCompany.HibernateInheritence.Entity.PermanentEmployee;

public class App 
{
    public static void main( String[] args )
    {
       Session session=null;
       try {
		
    	   session=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(ContractualEmployee.class).addAnnotatedClass(PermanentEmployee.class).buildSessionFactory().getCurrentSession();
    	   Employee employee1=new Employee("Shorya",LocalDate.now(),20000);
    	   Employee employee2=new ContractualEmployee("Amardeep", LocalDate.now(), 21000, 500);
    	   Employee employee3=new PermanentEmployee("Anshita", LocalDate.now(),40000, 5.5);
    	   session.getTransaction().begin();
    	   session.save(employee1);
    	   session.save(employee2);
    	   session.save(employee3);
    	   session.getTransaction().commit();
	} finally {
		//session.close();
		
	}
       
       
    }
}
