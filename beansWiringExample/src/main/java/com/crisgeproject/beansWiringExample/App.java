package com.crisgeproject.beansWiringExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Person;
import com.crisgeproject.beans.Vehicle;
import com.crisgeproject.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is " + person.getName());
        System.out.println("Vehicle name from Spring Context is " + vehicle.getName());
        System.out.println(person.getName() + " has a " + person.getVehicle());
        context.close();
    }
}
