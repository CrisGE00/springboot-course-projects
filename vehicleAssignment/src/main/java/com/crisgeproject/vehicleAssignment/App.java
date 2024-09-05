package com.crisgeproject.vehicleAssignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Person;
import com.crisgeproject.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Person person = context.getBean(Person.class);
        
        System.out.println(person.getName() + " has a " + person.getVehicle().getName());
        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().playMusic();
        
        context.close();
        
    }
}
