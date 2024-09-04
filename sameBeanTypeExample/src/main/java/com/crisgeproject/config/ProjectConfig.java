package com.crisgeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crisgeproject.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	Vehicle vehicle1() {
		var veh = new Vehicle();
		veh.setName("KIA Soul");
		return veh;
	}
	
	@Bean
	Vehicle vehicle2() {
		var veh = new Vehicle();
		veh.setName("Ford");
		return veh;
	}
	
	@Bean
	Vehicle vehicle3() {
		var veh = new Vehicle();
		veh.setName("Citroen");
		return veh;
	}
}