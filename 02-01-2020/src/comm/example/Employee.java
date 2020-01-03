package comm.example;

public class Employee {
 
	private int employeeId;
	private String employeeName;
	private double salary;
	
    //parameterised constructor
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
    
	//create new employee
	public static Employee createEmployee(int employeeId, String employeeName, int salary)
	{
		return new Employee(employeeId,employeeName,salary);
	}
	
	//display
	public String displayEmployeeDetails() {
		return "EmployeeId:" +employeeId+ " Employee Name:"+employeeName+ " Salary:"+salary;
	}
}
