package comm.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showform(){
		
		return "show-form";
	}
	@RequestMapping("/processform")
	public String processForm(HttpServletRequest request,Model model) {
		
	    String name=request.getParameter("name");
	    model.addAttribute("message",name);
		return "process-form";
	}
	

}
