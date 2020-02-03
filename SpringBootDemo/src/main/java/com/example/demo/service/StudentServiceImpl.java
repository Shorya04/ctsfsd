package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	{
		dao=new StudentDaoImpl();
	}
	@Override
	public Student createStudent(Student student) {
		return dao.createStudent(student);
	}

}
