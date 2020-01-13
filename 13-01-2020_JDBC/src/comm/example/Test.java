package comm.example;

import java.sql.SQLException;
import java.util.List;

public class Test {
	EmployeeService service=new EmployeeServiceImpl();
		public static void main(String[] args) throws SQLException {

			Test test = new Test();
			
			test.service = new EmployeeServiceImpl();
			List<Employee> list=test.service.getAllEmployees();
			System.out.println("ID   NAME    SALARY");
			list.forEach(e->{
				System.out.println(e.getEmployee_Id()+"  "+e.getEmployee_name()+" "+e.getSalary());
			});
		}
}

	



