package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SocialLogo;
import com.example.demo.repository.SocialLogoRepository;

@Service
@Transactional
public class HomeInterfaceImpl implements HomeInterface {

	
	private SocialLogoRepository socR;
	
	@Autowired
	public HomeInterfaceImpl(SocialLogoRepository socR) {
		this.socR = socR;
	}
	
	@Override
	public List<SocialLogo> findAll() {
		return socR.findAll();
	}

	
	
}
