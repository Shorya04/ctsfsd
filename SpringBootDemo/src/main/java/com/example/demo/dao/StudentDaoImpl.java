package com.example.demo.dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private EntityManager entityManger;

	@Override
	@Transactional
	public Student createStudent(Student student) {
	Session session=entityManger.unwrap(Session.class);
	student.setUid(UUID.randomUUID().toString()); 
	session.save(student);
	return student;

	}

}
