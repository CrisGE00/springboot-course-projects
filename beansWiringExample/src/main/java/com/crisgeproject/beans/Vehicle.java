package com.crisgeproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	public Vehicle() {
		System.out.println("Vehicle bean created by spring");
	}
	
	private String name = "Toyota";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello(){
		System.out.println("Hello from Vehicle!!");
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
