package beans;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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


