package comm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.spring.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String toHome(Model model) {
		
		Student theStudent=new Student();
		
		model.addAttribute("student", theStudent);
		return "student-form";
	}
	@RequestMapping(method = RequestMethod.POST,path="/processLogin")
	public String processLogin(@ModelAttribute("student") Student theStudent) 
	{
	System.out.println("theStudent: " + theStudent.getFirstname()
	+ " " + theStudent.getLastname());
	
      return "success";
			
		}
	}


