package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/display")
	public String displayString() {
		return "Displaying User service controller";
	}

}
