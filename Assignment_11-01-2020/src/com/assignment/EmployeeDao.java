package com.assignment;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;


public class EmployeeDao {

	private List<Employee> list=null;
	private Employee employee;
	{
     list=new ArrayList<Employee>();
	}


	public Employee createEmployee(int employeeId, String employeeName, String department, DateFormat dateOfJoining,int age,int salary) {
		list.add(employee);
		return employee;
	}
}
