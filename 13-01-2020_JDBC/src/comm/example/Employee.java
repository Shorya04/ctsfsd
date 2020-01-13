package comm.example;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Employee implements Serializable {
	
	private static final long serialVersionUID=123456789L;

	private int Employee_Id;
	private String Employee_name;
	private double salary;
	
	
}
