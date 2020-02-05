package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	public List<Employee> findByEmployeeName(String employeeName);
	public List<Employee> findBySalary(double salary);
	public List<Employee> findByEmployeeNameAndSalary(String employeeName,double salary);
	public List<Employee> findByEmployeeNameOrSalary(String employeeName,double salary);
	public void deleteByEmployeeName(String employeeName);
	public void deleteBySalary(double salary);

}
