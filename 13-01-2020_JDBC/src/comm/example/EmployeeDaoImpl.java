package comm.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private MySqlConnection myCon=null;
	private Connection connection=null;
	private Statement statement=null;
	List<Employee> list=null;
	{
	myCon=MySqlConnection.getMyConnectionOject();
	list=new ArrayList<Employee>();
	try {
		 connection=myCon.getMyConnection();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		statement=connection.createStatement();
		ResultSet res=statement.executeQuery("Select employee_id,employee_name,salary from employee");
		while(res.next()) {
			list.add(new Employee(res.getInt("employee_Id"),
					res.getString("employee_name"),
				res.getDouble("salary")));
		}
			return list;
		}
		
		
}
		
	