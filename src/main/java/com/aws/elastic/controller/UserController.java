package com.aws.elastic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	

	@Autowired
	private BCryptPasswordEncoder bc;
	
	public String mainPage() {
		return "user/userMain";
	}
	
	public String login() {
		return "user/login";
	}
	
}
