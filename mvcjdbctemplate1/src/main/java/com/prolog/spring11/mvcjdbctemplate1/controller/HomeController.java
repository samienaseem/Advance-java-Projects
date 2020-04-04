package com.prolog.spring11.mvcjdbctemplate1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prolog.spring11.mvcjdbctemplate1.dao.ContactDdao;
import com.prolog.spring11.mvcjdbctemplate1.model.contact;

@Controller
public class HomeController {
	@Autowired
	ContactDdao cdao;

	/*@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}*/
	@RequestMapping("/")
	public String Home(Model m){
		List<contact> list=cdao.list();
		
		m.addAttribute("List", list);
		
		
		
		return "home";
	}
	@RequestMapping(value="/AddNew")
	public String AddnewContact(Model m){
		
		contact c=new contact();
		m.addAttribute("contact",c);
		
		return "AddNewPage";
		
	}
	
	@RequestMapping("/savedata")
	public String savedata(@ModelAttribute("contact") contact c){
		if(c.getName()!=""){
		int result=cdao.save(c);
		System.out.println(result);
		}
		return "redirect:/";
		
		
	}
}
