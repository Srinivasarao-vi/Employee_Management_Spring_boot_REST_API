package com.vasuit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp")
public class EmployeeController {
	
	@GetMapping("/new")
	public String createdNewEmployee() {
		
		return "Welcome to Employee";
	}
	

}
