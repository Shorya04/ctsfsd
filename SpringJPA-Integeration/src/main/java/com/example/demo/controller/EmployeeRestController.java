package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.EmployeeNotFoundException;
import com.example.demo.error.ErrorMessage;
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
    @ExceptionHandler
    public ResponseEntity<ErrorMessage> handleError1(EmployeeNotFoundException enf){
    	ErrorMessage errorMessage=new ErrorMessage();
    	errorMessage.setMessage(enf.getMessage());
    	errorMessage.setStatusCode(HttpStatus.NOT_FOUND.value());
    	errorMessage.setTime(LocalDateTime.now());
    	return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
    	}
    @ExceptionHandler
    public ResponseEntity<ErrorMessage> handleError2(Exception e){
    	ErrorMessage errorMessage=new ErrorMessage();
    	errorMessage.setMessage(e.getMessage());
    	errorMessage.setStatusCode(HttpStatus.BAD_REQUEST.value());
    	errorMessage.setTime(LocalDateTime.now());
    	return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
    }
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
    	
    	return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getById(@PathVariable Integer employeeId) throws Exception
    {
    	Optional<Employee> employee=employeeService.findById(employeeId);
    	if(!employee.isPresent())
    	{
    	throw new  EmployeeNotFoundException("Employee not found with ID "+employeeId);
    	}
    return employee;
}   
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
    	employee.setEmployeeId(0);
    	return employeeService.createEmployee(employee);
    }
}
