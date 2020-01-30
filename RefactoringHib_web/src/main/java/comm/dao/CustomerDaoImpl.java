package comm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import comm.model.Customer;
import comm.model.Customer;
import comm.util.CustomerUtil;


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
	public Customer createCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer findById(int id) {
		entityManager.getTransaction().begin();
		Customer c=entityManager.find(Customer.class, id);
		entityManager.getTransaction().commit();
		return c;
	}

	@Override
	public void updateCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
		
	}

}
