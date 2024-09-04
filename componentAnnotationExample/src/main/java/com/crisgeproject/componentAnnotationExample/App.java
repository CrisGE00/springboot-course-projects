package com.crisgeproject.componentAnnotationExample;

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
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from Spring Context is " + vehicle.getName());
        vehicle.printHello();
    }
}
