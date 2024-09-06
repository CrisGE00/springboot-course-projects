package com.crisgeproject.prototypeBeanExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.config.ProjectConfig;
import com.crisgeproject.services.VehicleService;

public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleService", VehicleService.class);
        System.out.println("Hashcode of vehicleservice1: " + vehicleService1.hashCode());
        System.out.println("Hashcode of vehicleservice2: " + vehicleService2.hashCode());
        
        if(vehicleService1 == vehicleService2) {
        	System.out.println("VehicleServices bean is a singleton scoped bean");
        }else {
        	System.out.println("VehicleServices bean is a prototype scoped bean");
        }
        
        context.close();
    }
}
