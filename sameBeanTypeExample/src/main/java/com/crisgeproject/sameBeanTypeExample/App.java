package com.crisgeproject.sameBeanTypeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Vehicle;
import com.crisgeproject.config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Initializes Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
        
        System.out.println("Vehicle 1 name from Spring Context: " + veh1.getName());
        System.out.println("Vehicle 2 name from Spring Context: " + veh2.getName());
        System.out.println("Vehicle 3 name from Spring Context: " + veh3.getName());
        
        context.close();
    }
}
