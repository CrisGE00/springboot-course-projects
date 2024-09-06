package com.crisgeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.crisgeproject.beans.Speaker;
import com.crisgeproject.beans.Tire;

@Configuration
@ComponentScan(basePackages = {"com.crisgeproject.beans","com.crisgeproject.services"})
public class ProjectConfig {

	@Bean
	@Primary
	Tire bridgeStone() {
		Tire bridgeTire = new Tire();
		bridgeTire.setName("Bridgestone");
		return bridgeTire;
	}
	
	@Bean
	Tire michelin() {
		Tire micheTire = new Tire();
		micheTire.setName("Michelin");
		return micheTire;
	}
	
	@Bean
	@Primary
	Speaker sony() {
		Speaker sonySpeaker = new Speaker();
		sonySpeaker.setName("Sony");
		return sonySpeaker;
	}
	
	@Bean
	Speaker bose() {
		Speaker boseSpeaker = new Speaker();
		boseSpeaker.setName("Bose");
		return boseSpeaker;
	}
	
}
