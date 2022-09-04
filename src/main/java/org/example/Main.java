package org.example;

import org.example.config.ProjectConfig;
import org.example.main.Parrot;
import org.example.main.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's parrot " + person.getParrot());
        System.out.println("Parrot's person " + parrot.getPerson());
    }
}