package com.aws.elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ElasticController {

//	@Autowired
//	private  
	
	public String mainPage() {
		return "Main";
	}
}
