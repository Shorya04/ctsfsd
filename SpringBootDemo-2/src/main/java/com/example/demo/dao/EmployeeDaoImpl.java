package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> list;
	{
		list=new ArrayList<Employee>();
		list.add(new Employee(1,"shorya", 20000));
		list.add(new Employee(2, "saurav", 22000));
		list.add(new Employee(3, "tanishka", 21000));
		list.add(new Employee(4, "rahul", 23000));
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}
