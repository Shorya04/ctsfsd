package SpringAnnotations.src.main.java.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter

@Component
public class Employee {
	
	@Value("${employee.id}")
	private int employeeId;
	@Value("${employee.firstname}")
    private String FirstName;
	@Value("${employee.lastname}")
    private String LastName;
	@Autowired
	private Address address;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", address=" + address + "]";
	}
	
	
    
	
}
