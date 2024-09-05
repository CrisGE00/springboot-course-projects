package com.crisgeproject.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void initialize() {
		this.name = "Ford";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying bean...");
	}
	
	public void printHello(){
		System.out.println("Helloooo");
	}
	
}
