package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactInterfaceImpl implements ContactInterface{
	
	private ContactRepository contactR;
	
	@Autowired
	public ContactInterfaceImpl(ContactRepository contactR) {
		this.contactR = contactR;
	}

	@Override
	public List<Contact> findAllContacts() {
		return contactR.findAll();
	}

}
