package com.crisgeproject.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value="personBean")
@Lazy
public class Person {

	private String name;
	
	public Person() {
		System.out.println("Person bean created by Spring");
	}

	@PostConstruct
	public void initialize() {
		this.name = "Lucy";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
