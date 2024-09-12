package com.crisgeproject.schoolApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crisgeproject.schoolApp.model.Contact;
import com.crisgeproject.schoolApp.service.ContactService;

@Controller
public class ContactController {
	
	private final ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@RequestMapping("/contact")
	public String displayHomePage() {
		return "contact.html";
	}
	
	@RequestMapping(value = "/saveMsg",method = RequestMethod.POST)
	public ModelAndView saveMessage(Contact contact) {
		contactService.saveMessageDetails(contact);
		return new ModelAndView("redirect:/contact");
	}
	
}
