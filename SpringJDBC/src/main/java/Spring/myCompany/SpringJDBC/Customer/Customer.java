package Spring.myCompany.SpringJDBC.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private String customerUID;
	private String customerName;
	private double salary;
	private String email;
	@Override
	public String toString() {
		return "Customer [customerUID=" + customerUID + ", customerName=" + customerName + ", salary=" + salary
				+ ", email=" + email + "]";
	}
	
	
}
