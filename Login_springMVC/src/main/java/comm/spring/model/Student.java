package comm.spring.model;

import java.util.HashMap;
import java.util.LinkedHashMap;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student {
 
	private String firstname;
	private String lastname;
	private String language;
	private LinkedHashMap<String, String> countries;
	private String country;
	private String[] operatingSystems;
	
	
	
	public Student() {
		countries =new LinkedHashMap<>();
		countries.put("BR", "Brazil");
		countries.put("IN", "India");
		countries.put("FR", "France");
		countries.put("DE", "Germany");
		countries.put("UAE", "United Arab Emirates");
		countries.put("USA", "United States of America");
	}
		
	}
	
	
	
	