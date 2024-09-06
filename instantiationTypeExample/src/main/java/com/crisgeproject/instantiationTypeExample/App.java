package com.crisgeproject.instantiationTypeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crisgeproject.beans.Person;
import com.crisgeproject.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from the Spring context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring context");
        context.close();
    }
}
