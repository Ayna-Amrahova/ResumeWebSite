package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AboutInformation;
import com.example.demo.entity.CodingSkill;
import com.example.demo.entity.Education;
import com.example.demo.entity.Experience;
import com.example.demo.entity.Interest;
import com.example.demo.entity.Knowledge;
import com.example.demo.entity.SocialLogo;

public interface ResumeInterface {

	
	public List<SocialLogo> findAllLogo();
	public List<AboutInformation> findAllAbout();
	public List<Experience> findAllExperience();
	public List<Education> findAllEducation();
	public List<CodingSkill> findAllCodingSkill();
	public List<Knowledge> findAllKnowledge();
	public List<Interest> findAllInterest();

	
}
