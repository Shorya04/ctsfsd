package HIBERNATE.myCompany.hibernateAnnotation;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.hibernateAnnotation.Model.ToDo;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(ToDo.class).buildSessionFactory();
			Session session=factory.openSession();
			ToDo todo=new ToDo( 1, "Shorya");
			todo.setUid(UUID.randomUUID().toString());
			//todo.setTodoId(1);
			//todo.setTodoName("Shorya");
			todo.setCreationDate(LocalDateTime.now());
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			System.out.println(todo);
		} catch (Exception e) {
			e.printStackTrace();
		}
    /* finally {
    	 session.close();
    	 factory.close();*/
     
    }
}
