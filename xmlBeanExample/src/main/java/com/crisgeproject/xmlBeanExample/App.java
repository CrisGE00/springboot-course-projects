package com.crisgeproject.xmlBeanExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crisgeproject.beans.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        
    	var context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Vehicle vehicle = context.getBean(Vehicle.class);
    	System.out.println("The vehicle name is " + vehicle.getName());
    	
    	context.close();
    }
}
