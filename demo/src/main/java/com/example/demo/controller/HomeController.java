package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.SocialLogo;
import com.example.demo.service.HomeInterface;

@Controller		
@RequestMapping("/ResumeProject")
public class HomeController {

    private HomeInterface homeI;
	
	@Autowired
	public HomeController(HomeInterface homeI) {
		this.homeI = homeI;
	}
	
	
	@GetMapping({"", "/home"})
	public String findAllLogoHome(Model model){
		List <SocialLogo> listHome = homeI.findAll();
		model.addAttribute("logo", listHome);
		return "home";
	}
	
}
