package com.crisgeproject.schoolApp.service;

import org.springframework.stereotype.Service;

import com.crisgeproject.schoolApp.model.Contact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {
	
	public boolean saveMessageDetails(Contact contact) {
		boolean isSaved = true;
		log.info(contact.toString());
		return isSaved;
	}
}
