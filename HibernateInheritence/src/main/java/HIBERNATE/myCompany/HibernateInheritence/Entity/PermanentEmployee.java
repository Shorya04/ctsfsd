package HIBERNATE.myCompany.HibernateInheritence.Entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Permanent")
public class PermanentEmployee extends Employee{
	
	double experience;

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(String name, LocalDate doj,double salary,double experience) {
		super(name,doj,salary);
		this.experience = experience;
	}
	
	
	
	

}
