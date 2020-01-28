package dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import comm.model.Customer;
import util.CustomerUtil;

public class CustomerDaoImpl implements CustomerDao {
	
	private Session session;
	private EntityManager entityManager;
	{
		session=CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entityManager=session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	

	@Override
	public Customer cretateCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

}
