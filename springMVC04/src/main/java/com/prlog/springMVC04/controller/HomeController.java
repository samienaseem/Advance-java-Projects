package com.prlog.springMVC04.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("HomeController")
public class HomeController {

	@RequestMapping(value="/")
	public String showpage(){
		return "home";
	}
	@RequestMapping(value="/showform")
	public String showform(HttpServletRequest req,HttpServletResponse res){
		
		/*RequestDispatcher rd=req.getRequestDispatcher(req.getPathInfo()+"/student/showform.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*return "helloworld-form";*/
		return "redirect:/student/showform";
	}
	
	@RequestMapping(value="/processform")
	public String processform(){
		return "processform";
	}
	
	@RequestMapping("processformversion2")
	public String processData(HttpServletRequest req, Model model){
		String name=req.getParameter("name");
		String convertedName=name.toUpperCase();
		model.addAttribute("name",convertedName);
		return "processform";	
	}
	
	@RequestMapping("processformversion3")
	public String processData2(@RequestParam(value="name")String name,Model model){
		String converted=name.toUpperCase();
		model.addAttribute("samie",converted);
		return "processform";
		
	}
	
}
