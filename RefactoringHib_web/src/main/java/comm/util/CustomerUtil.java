package comm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.model.Customer;

public class CustomerUtil {
	private static SessionFactory factory=null;
	public static SessionFactory getMySessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
	}

}
