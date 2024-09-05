package com.crisgeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crisgeproject.beans.Person;
import com.crisgeproject.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	public Vehicle vehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("toyota");
		return vehicle;
	}
	
	/** Wiring without method parameters
	
	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("Lucy");
		person.setVehicle(vehicle());
		return person;
	} **/
	
	// Wiring with method parameters
	@Bean
	public Person person(Vehicle vehicle) {
		Person person = new Person();
		person.setName("Lucy");
		person.setVehicle(vehicle);
		return person;
	}
}
