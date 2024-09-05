package com.crisgeproject.registerBeanExample;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Vehicle;
import com.crisgeproject.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	// Creating the object outside lambda expression
    	Vehicle ford = new Vehicle();
    	ford.setName("Ford");
    	
    	Supplier<Vehicle> fordSupplier = () -> ford;
    	
    	// Creating the object inside lambda
    	Supplier<Vehicle> kiaSupplier = () -> {
    		Vehicle kia = new Vehicle();
    		kia.setName("KIA");
    		return kia;
    	};
    	
    	Random random = new Random();
    
    	int randomNumber = random.nextInt(10);
    	System.out.println("Random number = " + randomNumber);
    	
    	if((randomNumber% 2) == 0) {
    		context.registerBean("ford", Vehicle.class, fordSupplier);
    	}else {
    		context.registerBean("kia", Vehicle.class, kiaSupplier);
    	}
    	
    	Vehicle kiaVehicle = null;
    	Vehicle fordVehicle = null;
    	
    	try {
    		fordVehicle = context.getBean("ford", Vehicle.class);
    	}catch(NoSuchBeanDefinitionException e) {
    		System.out.println("Error while creating ford vehicle");
    	}
    	
    	try {
    		kiaVehicle = context.getBean("kia", Vehicle.class);
    	}catch(NoSuchBeanDefinitionException e) {
    		System.out.println("Error while creating kia vehicle");
    	}
    	
    	if(null != fordVehicle) {
    		System.out.println("The vehicle is " + fordVehicle.getName());
    	}else {
    		System.out.println("The vehicle is " + kiaVehicle.getName());
    	}
    }
}
