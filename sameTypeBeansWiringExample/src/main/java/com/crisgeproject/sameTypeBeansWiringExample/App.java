package com.crisgeproject.sameTypeBeansWiringExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Person;
import com.crisgeproject.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
    	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	Person person = context.getBean(Person.class);
    	System.out.println("Person's name is " + person.getName());
    	System.out.println(person.getName() + "'s vehicle is " + person.getVehicle());
    	context.close();
    }
}
