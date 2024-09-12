package com.crisgeproject.schoolApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crisgeproject.schoolApp.model.Contact;
import com.crisgeproject.schoolApp.service.ContactService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ContactController {
	
	private final ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@RequestMapping("/contact")
	public String displayContactPage(Model model) {
		model.addAttribute("contact", new Contact());
		return "contact.html";
	}
	
	@RequestMapping(value = "/saveMsg",method = RequestMethod.POST)
	public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
		if(errors.hasErrors()) {
			log.error("Contact form validation failed due to " + errors.toString());
			return "contact.html";
		}
		contactService.saveMessageDetails(contact);
		return "redirect:/contact";
	}
	
}
