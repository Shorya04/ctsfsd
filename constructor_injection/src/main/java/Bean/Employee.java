package Bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String employeeId;
	private String employeeName;
	private Address address;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", Address=" + address + "]";
	}
	
	

}
