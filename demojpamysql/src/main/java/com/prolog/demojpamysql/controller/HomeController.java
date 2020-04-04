package com.prolog.demojpamysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String Homepage(){
		return "index";
	}
	@RequestMapping("/home")
	public String Newpage(){
		return "home";
	}
}
