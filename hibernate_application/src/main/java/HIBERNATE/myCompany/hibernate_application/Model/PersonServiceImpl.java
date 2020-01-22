package HIBERNATE.myCompany.hibernate_application.Model;

import java.io.IOException;
import java.util.List;

public class PersonServiceImpl implements PersonService {
	private PersonDao dao;

	@Override
	public Person createPerson(Person person) {
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPerson() {
		return dao.getAllPerson();
	}

	@Override
	public Person findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public Person UpdatePerson(Integer id) throws IOException {
		return dao.UpdatePerson(id);
	}

	@Override
	public void deletePerson(Integer id) {
      dao.deletePerson(id);
		
	}

}
