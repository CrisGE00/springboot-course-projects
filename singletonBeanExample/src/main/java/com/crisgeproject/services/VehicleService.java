package com.crisgeproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crisgeproject.beans.Speaker;
import com.crisgeproject.beans.Tire;

@Component
public class VehicleService {

	@Autowired
	private Tire tire;
	@Autowired
	private Speaker speaker;
	
	public void moveVehicle() {
		String status = tire.rotate();
		System.out.println(status);
	}

	public void playMusic() {
		String music = speaker.makeSound();
		System.out.println(music);
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
}
