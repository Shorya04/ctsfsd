package Spring.myCompany.JdbcTemplate.Beans;

import org.springframework.jdbc.core.JdbcTemplate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Customer {

	private String customerUID;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public Customer(String firstNmae, String lastName, String email) {
		super();
		this.firstName = firstNmae;
		this.lastName = lastName;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Customer [customerUID=" + customerUID + ", firstNmae=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
	
	
}

