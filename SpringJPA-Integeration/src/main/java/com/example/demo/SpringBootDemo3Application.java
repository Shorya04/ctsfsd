package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@SpringBootApplication
public class SpringBootDemo3Application implements CommandLineRunner {
	
	private EmployeeDao employeeDao;
	
	@Autowired
    public SpringBootDemo3Application(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeDao.save(new Employee("Shorya",20000));
		employeeDao.save(new Employee("Tanishka",21000));
		employeeDao.save(new Employee("Rahul",22000));
		employeeDao.save(new Employee("Saurav",23000));
		
		
	}

}
