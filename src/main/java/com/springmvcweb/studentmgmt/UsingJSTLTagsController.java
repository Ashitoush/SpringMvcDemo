package com.springmvcweb.studentmgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvcweb.studentmgmt.services.StudentService;

@Controller
public class UsingJSTLTagsController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/showjstlpage", method = RequestMethod.GET)
	public String showjstlpage(ModelMap model) {
		
		model.addAttribute("using", "ModelMap");
		model.addAttribute("slist", studentService.getAllStudents());
		return "defaultjstl";
	}
	
	@RequestMapping(value = "/showaddstudent", method = RequestMethod.GET)
	public String showaddstudent() {
		
		return "addstudent";
	}
	
	
}
