package comm.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Cd;

@Controller
@RequestMapping("/cd")
public class CdController {
	
  @GetMapping("/showform")	
  public String addCd() {
	  
	  return "add_cd";
  }
  
  @RequestMapping("/processform")
  public String processForm(@RequestParam("title") String cdName, @RequestParam("type") String cdType, @RequestParam("year") String year, Model theModel) {
	  
         Cd cd=new Cd(cdName, cdType, year);
         theModel.addAttribute("cd", cd);
         return "success";
  }

}
