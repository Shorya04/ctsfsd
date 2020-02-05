package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Service
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Optional<Employee> findById(Integer employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeDao.findById(employeeId);
		return employee;
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteById(Integer employeeId) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(employeeId);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		employeeDao.deleteAll();
	}

	@Override
	public List<Employee> findByEmployeeName(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmployeeName(employeeName);
	}

	@Override
	public List<Employee> findBySalary(Double salary) {
		// TODO Auto-generated method stub
		return employeeDao.findBySalary(salary);
	}

	@Override
	public List<Employee> findByEmployeeNameAndSalary(String employeeName, double salary) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmployeeNameAndSalary(employeeName, salary);
	}

	@Override
	public List<Employee> findByEmployeeNameOrSalary(String employeeName, double salary) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmployeeNameOrSalary(employeeName, salary);
	}

}
