package com.crisgeproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crisgeproject.services.VehicleServices;

import jakarta.annotation.PostConstruct;

@Component("vehicleBean")
public class Vehicle {

	private String name;
	private final VehicleServices vehicleService;
	
	@Autowired
	public Vehicle(VehicleServices vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	@PostConstruct
	public void initialize() {
		this.name = "Audi R8";
	}
	
	public VehicleServices getVehicleService() {
		return vehicleService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
