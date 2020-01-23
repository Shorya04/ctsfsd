package HIBERNATE.myCompany.HibernateInheritence.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Employee_type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Regular")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	String name;
	@Column(name="Date_of_joining")
	LocalDate doj;
	double salary;
	public Employee() {
	}
	
	public Employee(String name, LocalDate doj,double salary) {
		super();
		this.name = name;
		this.doj = doj;
		this.salary=salary;
	}
	
	
}
