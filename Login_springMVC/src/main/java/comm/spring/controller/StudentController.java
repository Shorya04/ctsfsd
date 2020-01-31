package comm.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	public String processLogin(@Valid@ModelAttribute("student") Student theStudent,BindingResult result) 
	{
		
	System.out.println("theStudent: " + theStudent.getFirstname()
	+ " " + theStudent.getLastname());
	if(result.hasErrors()) {
		
	return "student-form";
	}
	else
	{

		return "success";
			
		}
	}
}


