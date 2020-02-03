package com.example.demo.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentDao studentDao;
	
	@RequestMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("student", new Student());
		return "show-form";
	}
	@RequestMapping("/processform")
	public String displayForm(@ModelAttribute("student") Student student,Model model) {
		model.addAttribute("student",student);
		studentDao.createStudent(student);
		return "process-form";
		
	}

}
