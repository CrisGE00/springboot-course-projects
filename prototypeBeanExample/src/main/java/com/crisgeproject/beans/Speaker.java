package com.crisgeproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Speaker {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String makeSound() {
		return "The " + this.name + " speakers are playing music";
	}
	
}