package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Optional<Employee> findById(Integer employeeId);
	public Employee createEmployee(Employee employee);
	public void deleteById(Integer employeeId);
	public void deleteAll();
	public List<Employee> findByEmployeeName(String employeeName);
	public List<Employee> findBySalary(Double salary);
	public List<Employee> findByEmployeeNameAndSalary(String employeeName,double salary);
	public List<Employee> findByEmployeeNameOrSalary(String employeeName,double salary);
	


}
