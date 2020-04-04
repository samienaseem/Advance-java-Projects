package com.prlog.springMVC04.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prlog.springMVC04.model.Student;
@Controller
@RequestMapping("student")
public class StudentController {
	@RequestMapping("showform")
	public String showform(Model model){
		
		Student student=new Student();
		model.addAttribute("student",student);
		
		return "student-from";
		
	
	}
	@RequestMapping("processform")
	public String processform(@ModelAttribute("student") Student student){
		
		
		return "student-confirmation";
	}

}
