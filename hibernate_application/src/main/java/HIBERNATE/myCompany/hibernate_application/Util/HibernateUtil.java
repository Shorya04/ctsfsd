package HIBERNATE.myCompany.hibernate_application.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.istack.internal.logging.Logger;

import HIBERNATE.myCompany.hibernate_application.Model.Person;

public class HibernateUtil {

	private static SessionFactory factory;
	
	static {
		factory=new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
	}
	
	private HibernateUtil() {
	}
	public static Session getSession() {
		return factory.openSession();
	}
}
