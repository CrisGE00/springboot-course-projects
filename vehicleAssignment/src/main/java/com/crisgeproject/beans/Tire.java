package com.crisgeproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String rotate() {
		return "The " + this.name + " tires are rotating";
	}
	
}
