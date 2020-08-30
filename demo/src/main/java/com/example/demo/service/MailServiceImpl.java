package com.example.demo.service;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements MailService{
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void send(String fromAddress, String toAddress, String subject, String message) throws Exception {
		
		final MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		final MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setFrom(fromAddress);
		mimeMessageHelper.setTo(toAddress);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.setText(message, true);
		mimeMessageHelper.setSentDate(new Date());
		javaMailSender.send(mimeMessage);
		
	}
	

}
