package comm.spring.model;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student {
    @NotNull 
    @Size(min = 3,max = 8,message = "First Name Required")
	private String firstname;
    @NotNull
    @Size(min=3, max = 10,message = "Last Name Required")
	private String lastname;
    @Email(message = "Enter valid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^((\\+){1}91){1}[1-9]{1}[0-9]{9}$",message = "Enter Registered Mobile number")
    private String mobile;
	private String language;
	private LinkedHashMap<String, String> countries;
	private String country;
	private String[] operatingSystems;
	@Range(min = 18,max = 55,message = "Age must be in between 18-55")
	private int age;
	
	
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
	
	
	
	