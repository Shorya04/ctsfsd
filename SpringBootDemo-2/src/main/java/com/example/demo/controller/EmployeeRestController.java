package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
	private EmployeeService employeeService;
    
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
}
