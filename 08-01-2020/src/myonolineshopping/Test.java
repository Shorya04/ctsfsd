package myonolineshopping;

public class Test  {
	
	public static void main(String[] args) throws EmployeeNotCreatedException {
		
		Employee employee=new Employee();
		employee=employee.createEmployee("Abc","Mumbai",2.5);
		System.out.println(employee);
		Employee employee1=new Employee();
		employee1=employee1.createEmployee("Abc", "Mumbai",3.5);
		System.out.println(employee1);
		if(employee.equals(employee1))
		{
		throw new EmployeeNotCreatedException("employee can't be created");
		}
		
	}

}
