package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/appConfig.xml");
        Person person = context.getBean("person", Person.class);
        person.doSome();
        }
    }