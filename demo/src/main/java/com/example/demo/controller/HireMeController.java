package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.HireMe;
import com.example.demo.service.MailService;

@Controller
@RequestMapping("/hireMe")
public class HireMeController {

	@Autowired
	private MailService mailService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("hireMe", new HireMe());
		return "index";
	}
	
	@RequestMapping(value = "send", method = RequestMethod.POST)
	public String send(@ModelAttribute("hireMe") HireMe hireMe,  ModelMap modelMap) {
		try {
			String content = "Name: " + hireMe.getName();
			content += "<br>Email: " + hireMe.getEmail();
			content += "<br>Message: " + hireMe.getMessage();
			mailService.send(hireMe.getEmail(), "emrahova.a00@gmail.com", hireMe.getSubject(), content);
			modelMap.put("msg", "Done!");
		} catch (Exception e) {
			modelMap.put("msg", hireMe.getEmail());
		}
		
		
		return "index";
	}
}
