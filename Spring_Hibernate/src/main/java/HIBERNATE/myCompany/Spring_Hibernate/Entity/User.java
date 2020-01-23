package HIBERNATE.myCompany.Spring_Hibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userId;
	@Length(min=8, max=15,message="Invalid Username")
	private String userName;
	@Email(message="Invalid Email")
	private String email;
	public User(String userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	
	} 
	


