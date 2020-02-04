package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}
	


}
