package HIBERNATE.myCompany.Spring_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import HIBERNATE.myCompany.Spring_Hibernate.Entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private SessionFactory factory;
	private Session session;
	
	
    @Autowired
	public UserDaoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
		session=factory.openSession();
	}


	


	@Override
	public User createUserDetails(User user) {
		session.save(user);
		return user;
	}

}
