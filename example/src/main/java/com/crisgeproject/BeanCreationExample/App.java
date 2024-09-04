package com.crisgeproject.BeanCreationExample;

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
        
        Vehicle veh = context.getBean(Vehicle.class);
        String hello = context.getBean(String.class);
        Integer num = context.getBean(Integer.class);
        
        System.out.println("Vehicle name from Spring Context: " + veh.getName());
        System.out.println("String value from Spring Context: " + hello);
        System.out.println("Integer value from Spring Context: " + num);
        
        context.close();
    }
}
