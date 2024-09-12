package com.crisgeproject.schoolApp.service;

import org.springframework.stereotype.Service;

import com.crisgeproject.schoolApp.model.Contact;

@Service
public class ContactService {
	
	public boolean saveMessageDetails(Contact contact) {
		boolean isSaved = true;
		System.out.println(contact.toString());
		return isSaved;
	}
}
