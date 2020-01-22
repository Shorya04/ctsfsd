package HIBERNATE.myCompany.hibernate_application.Model;

import java.io.IOException;
import java.util.List;

public interface PersonService {
	public Person createPerson(Person person);
	public List<Person> getAllPerson();
	public Person findById(Integer id);
	public Person UpdatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);

}
