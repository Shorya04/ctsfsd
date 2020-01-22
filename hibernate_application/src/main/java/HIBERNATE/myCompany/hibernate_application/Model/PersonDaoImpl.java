package HIBERNATE.myCompany.hibernate_application.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import HIBERNATE.myCompany.hibernate_application.Util.HibernateUtil;

public class PersonDaoImpl implements PersonDao {

	private Session session;
	private Transaction transaction;
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	{
		session=HibernateUtil.getSession();
		transaction=session.getTransaction(); 
	}
	@Override
	public Person createPerson(Person person) {
		try {
			transaction.begin();
			session.save(person);
			transaction.commit();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public List<Person> getAllPerson() {
	   Query query=session.createQuery("from Person");
	   return query.list();
	}

	@Override
	public Person findById(Integer id) {
		Person person=session.get(Person.class,id);
		if(person==null)
		{
			System.out.println("Id not found!!");
		}
		return person;
	}

	@Override
	public Person UpdatePerson(Integer id) throws IOException {
		Person person=session.get(Person.class,id);
		if(person==null)
		{
			System.out.println("Id not found!!");
		}
		else{
			System.out.println("Name: ");
			String n=br.readLine();
			person.setName(n);
			person.setDate(LocalDate.now());
			transaction.begin();
			session.update(person);
			transaction.commit();
		}
		return person;
	}

	@Override
	public void deletePerson(Integer id) {
		Person person=session.get(Person.class,id);
		if(person==null)
		{
			System.out.println("Id not found!!");
		}
		else {
			transaction.begin();
			session.delete(person);
			transaction.commit();
			
		}
		
	}

}
