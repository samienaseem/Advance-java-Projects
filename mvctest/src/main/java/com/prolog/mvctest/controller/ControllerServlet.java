package com.prolog.mvctest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerServlet {
	
	@RequestMapping("/") 
	public String Showpage(){
		return "home";
	}
	@RequestMapping("/showform")
	public String Showform(){
		return "showform";
	}
	@RequestMapping("/display")
	public String display(/*HttpServletRequest req, Model m*/){
		
		/*String name=req.getParameter("name");
		name=name.toUpperCase();
		m.addAttribute("msg", name);*/
		return "display";
	}
}
