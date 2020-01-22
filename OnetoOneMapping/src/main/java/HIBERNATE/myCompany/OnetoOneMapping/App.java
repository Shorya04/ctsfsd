package HIBERNATE.myCompany.OnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HIBERNATE.myCompany.OnetoOneMapping.Model.Task;
import HIBERNATE.myCompany.OnetoOneMapping.Model.Todo;

public class App 
{
    public static void main( String[] args )
    {
try {
			
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(Todo.class).addAnnotatedClass(Task.class).buildSessionFactory();
			Session session=factory.openSession();
			Todo todo=new Todo("Learning");
			todo.setTask(new Task("E-Learning"));
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
    }

