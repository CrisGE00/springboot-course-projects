package com.crisgeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.crisgeproject.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Primary
	@Bean(name="kiaVehicle")
	Vehicle vehicle1() {
		var veh = new Vehicle();
		veh.setName("KIA Soul");
		return veh;
	}
	
	@Bean(value="fordVehicle")
	Vehicle vehicle2() {
		var veh = new Vehicle();
		veh.setName("Ford");
		return veh;
	}
	
	@Bean("citroenVehicle")
	Vehicle vehicle3() {
		var veh = new Vehicle();
		veh.setName("Citroen");
		return veh;
	}
}