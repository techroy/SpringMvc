package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.command.StudentCommand;

@Controller
public class StudentController {

	@ModelAttribute(value="qualifications")
	public Map<String,String> qulificationModel(){
		
		
		System.out.println("----------Model Attribute-----");
		Map<String,String> qualificationMap = new HashMap<String,String>();
		
		qualificationMap.put("bca","BCA");
		qualificationMap.put("be","BE");
		qualificationMap.put("mca","MCA");
		
		return qualificationMap;
	}
	
	
	@RequestMapping(value = "/enroll", method = RequestMethod.GET)
	public String getStdEnrollPage(ModelMap modelMap) {

		/*Map<String,String> qualificationMap = new HashMap<String,String>();
		
		qualificationMap.put("bca","BCA");
		qualificationMap.put("be","BE");
		qualificationMap.put("mca","MCA");
	*/	
		
		//modelMap.addAttribute("qualifications",qualificationMap);
		
		System.out.println("----------enroll get-----");
		
		modelMap.addAttribute("studentcommand", new StudentCommand());
		
		return "enroll";
	}

	@RequestMapping(value = "/stdenroll", method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute(name = "studentcommand") StudentCommand studentCommand) {

		System.out.println("----------enroll reg post-----");
		
		ModelAndView modelAndView = new ModelAndView();

		System.out.println(studentCommand);

		modelAndView.setViewName("enrollsuccess");

		return modelAndView;
	}
	
	@RequestMapping(value = "/enrollhistory", method = RequestMethod.GET)
	public String enrollHistory(){
		
		
		return "enrollhistory";
	}
}
