package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AboutInformation;
import com.example.demo.entity.CodingSkill;
import com.example.demo.entity.Education;
import com.example.demo.entity.Experience;
import com.example.demo.entity.Interest;
import com.example.demo.entity.Knowledge;
import com.example.demo.entity.SocialLogo;
import com.example.demo.repository.AboutInformationRepository;
import com.example.demo.repository.CodingSkillRepository;
import com.example.demo.repository.EducationRepository;
import com.example.demo.repository.ExperienceRepository;
import com.example.demo.repository.InterestRepository;
import com.example.demo.repository.KnowledgeRepository;
import com.example.demo.repository.SocialLogoRepository;

@Service
public class ResumeInterfaceImpl implements ResumeInterface{
	
	private AboutInformationRepository aboutR;
	private SocialLogoRepository socialR;
	private ExperienceRepository expR;
	private EducationRepository eduR;
	private CodingSkillRepository codeR;
	private KnowledgeRepository knowledgeR;
	private InterestRepository interestR;

	
	@Autowired
	public ResumeInterfaceImpl(SocialLogoRepository socialR, 
								AboutInformationRepository aboutR, 
								ExperienceRepository expR, 
								EducationRepository eduR,
								CodingSkillRepository codeR,
								KnowledgeRepository knowledgeR,
								InterestRepository interestR) {
		this.socialR = socialR;
		this.aboutR = aboutR;
		this.expR = expR;
		this.eduR = eduR;
		this.codeR = codeR;
		this.knowledgeR = knowledgeR;
		this.interestR = interestR;
	}
	

	@Override
	public List<SocialLogo> findAllLogo() {
		return socialR.findAll();
	}

	@Override
	public List<AboutInformation> findAllAbout() {
		return aboutR.findAll();
	}


	@Override
	public List<Experience> findAllExperience() {
		return expR.findAll();
	}


	@Override
	public List<Education> findAllEducation() {
		return eduR.findAll();
	}


	@Override
	public List<CodingSkill> findAllCodingSkill() {
		return codeR.findAll();
	}


	@Override
	public List<Knowledge> findAllKnowledge() {
		return knowledgeR.findAll();
	}


	@Override
	public List<Interest> findAllInterest() {
		return interestR.findAll();
	}




}
