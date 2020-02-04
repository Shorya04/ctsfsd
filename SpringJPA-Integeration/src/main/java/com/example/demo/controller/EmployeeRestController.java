package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;
    @Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
    	
    	return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getById(@PathVariable Integer employeeId)
    {
    	return employeeService.findById(employeeId);
    }
	
	
}
