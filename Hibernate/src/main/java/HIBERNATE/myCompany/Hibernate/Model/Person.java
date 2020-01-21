package HIBERNATE.myCompany.Hibernate.Model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

	private String uid;
	private String pName;
	
}
