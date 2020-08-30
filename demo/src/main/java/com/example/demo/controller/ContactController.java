package com.example.demo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Contact;
import com.example.demo.entity.HireMe;
import com.example.demo.entity.SocialLogo;
import com.example.demo.service.ContactInterface;
import com.example.demo.service.MailService;
import com.example.demo.service.ResumeInterface;

@Controller
@RequestMapping("/ResumeProject")
public class ContactController {
	
	private ContactInterface contactI;
	private ResumeInterface resumeI;

	
	
	
	@Autowired
	public ContactController(ContactInterface contactI, ResumeInterface resumeI) {
		this.contactI = contactI;
		this.resumeI = resumeI;
	}

	
	@GetMapping("/contact")
	public String findAll(Model contact, ModelMap modelMap, Model logo){
		List <Contact> listContacts = contactI.findAllContacts();
		contact.addAttribute("contact", listContacts);
		List <SocialLogo> listLogos = resumeI.findAllLogo();
		logo.addAttribute("logo", listLogos);
		modelMap.put("hireMe", new HireMe());
		return "contact";
	}
	
	
	@Autowired
	private MailService mailService;
	

	
	@RequestMapping(value = "contact", method = RequestMethod.POST)
	public String send(@ModelAttribute("hireMe") HireMe hireMe, Model contact, ModelMap modelMap, Model logo) {
		List <Contact> listContacts = contactI.findAllContacts();
		contact.addAttribute("contact", listContacts);
		List <SocialLogo> listLogos = resumeI.findAllLogo();
		logo.addAttribute("logo", listLogos);
		modelMap.put("hireMe", new HireMe());
		try {
			String content = "Name: " + hireMe.getName();
			content += "<br>Email: " + hireMe.getEmail();
			content += "<br>Message: " + hireMe.getMessage();
			mailService.send(hireMe.getEmail(), "yourEmail", hireMe.getSubject(), content);
			modelMap.put("msg", "Thank you for contacting us!");
		} catch (Exception e) {
			modelMap.put("msg", e.getMessage());
		}
		
		return "contact";
	}
	
}
