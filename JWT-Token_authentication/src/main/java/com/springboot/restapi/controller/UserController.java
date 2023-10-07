package com.springboot.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	
	@GetMapping({"/hello"})
	public String getMessage()
	{
		return "Welcome to Hello world";
	}
	
	         
	
	

}
