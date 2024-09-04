package com.crisgeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crisgeproject.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	Vehicle vehicle() {
		var veh = new Vehicle();
		veh.setName("KIA Soul");
		return veh;
	}
	
	@Bean
	String hello() {
		return "hello world";
	}
	
	@Bean
	Integer number() {
		return 32;
	}
}
