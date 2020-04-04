package com.prolog.springMVC02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	@RequestMapping("/")
	public String showPage(){
		return "home";
	}

}
