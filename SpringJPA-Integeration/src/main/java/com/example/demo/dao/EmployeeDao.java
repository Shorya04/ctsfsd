package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
