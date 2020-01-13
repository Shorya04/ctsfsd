package comm.example;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
		private EmployeeDao dao;
		
		{
			dao=new EmployeeDaoImpl();
		}

		@Override
		public List<Employee> getAllEmployees() throws SQLException {
			// TODO Auto-generated method stub
			return dao.getAllEmployees();
		}

	}

