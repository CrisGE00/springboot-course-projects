package com.crisgeproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crisgeproject.services.VehicleService;

import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {

	private String name;
	private final VehicleService vehicleService;
	
	@Autowired
	public Vehicle(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	@PostConstruct
	public void initialize() {
		this.name = "Audi R8";
	}
	
	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
