package HIBERNATE.myCompany.hibernate_application.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String uid;
	private String name;
	private LocalDate date;
	public Person(String uid, String name, LocalDate date) {
		super();
		this.uid = uid;
		this.name = name;
		this.date = date;
	}
	
	
	
}
