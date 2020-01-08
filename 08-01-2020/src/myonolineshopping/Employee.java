package myonolineshopping;

import java.util.UUID;



public class Employee {
	private String employeeId;
	private String employeeName;
	private  String employeeAddress;
	private Double employeeExperience;
	private Employee employee=null;
	public Employee() {
		super();
	}
	public Employee(String employeeId, String employeeName, String employeeAddress, Double employeeExperience)throws EmployeeNotCreatedException {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeExperience = employeeExperience;
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
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Double getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(Double employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	
	public Employee createEmployee(String employeeName,String employeeAddress,double employeeExperience) throws EmployeeNotCreatedException {
		employee=new Employee(UUID.randomUUID().toString(), employeeName, employeeAddress,employeeExperience);
		
		
		return employee;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + ((employeeExperience == null) ? 0 : employeeExperience.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object object) {  //throws EmployeeNotCreatedException {
		Employee employee=null;
		boolean isEqual=false;
		if(object instanceof Employee) {
			employee=(Employee) object;
		}
		if((this.getEmployeeName()==employee.getEmployeeName()) && (this.getEmployeeAddress()==employee.getEmployeeAddress())) 
		{
		isEqual=true;
		
		}
	return isEqual;
	}
	@Override
	public String toString() {
		return "name: "+employeeName+"Address: "+employeeAddress;
	}
	
	
	}

	
	

