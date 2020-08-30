package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.AboutInformation;
import com.example.demo.entity.CodingSkill;
import com.example.demo.entity.Education;
import com.example.demo.entity.Experience;
import com.example.demo.entity.Interest;
import com.example.demo.entity.Knowledge;
import com.example.demo.entity.SocialLogo;
import com.example.demo.service.ResumeInterface;
@Controller		
@RequestMapping("/ResumeProject")
public class ResumeController {

	private ResumeInterface resumeI;
	
	@Autowired
	public ResumeController(ResumeInterface resumeI) {
		this.resumeI = resumeI;
	}
	
	@GetMapping("/resume")
	public String findAll(Model logo, 
							Model about, 
							Model experience, 
							Model education,
							Model coding,
							Model knowledge,
							Model interest){
		List <SocialLogo> listLogos = resumeI.findAllLogo();
		logo.addAttribute("logo", listLogos);
		List <AboutInformation> listAbout = resumeI.findAllAbout();
		about.addAttribute("about", listAbout);
		List <Experience> listExperience = resumeI.findAllExperience();
		experience.addAttribute("experience", listExperience);
		List <Education> listEducation = resumeI.findAllEducation();
		education.addAttribute("education", listEducation);
		List <CodingSkill> listCodingSkill = resumeI.findAllCodingSkill();
		coding.addAttribute("codingSkill", listCodingSkill);
		List <Knowledge> listKnowledge = resumeI.findAllKnowledge();
		knowledge.addAttribute("knowledge", listKnowledge);
		List <Interest> listInterest = resumeI.findAllInterest();
		knowledge.addAttribute("interest", listInterest);
		return "resume";
	}
	
	
}
