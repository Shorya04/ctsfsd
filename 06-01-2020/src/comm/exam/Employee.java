package comm.exam;

import java.time.LocalDate;

public class Employee {
	
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	
	public Employee() {
		super();
	}

	public Employee(String employeeId, String employeeName, LocalDate dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public String getDetails() {
		return getObjectType(this)+"Name: "+getEmployeeName()+"ID: "+getEmployeeId()+"Date: "+getDateOfJoining();
	}
	
	public String getObjectType(Employee e){
		if(e instanceof PermanentEmployee) {
			return "Employee type:  Permanent";
		}
		else if(e instanceof TempEmployee) {
			return "Employee Type: Temporary";
		}
		else if(e instanceof Consultant) {
			return "Employee Type: Consultant";
		}
		else
		{
			return "Employee Type: UNKNOWN";
			
		}
	}
	

}
