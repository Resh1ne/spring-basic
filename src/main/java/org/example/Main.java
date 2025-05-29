package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext("/appConfig.xml");
        AnnotationConfigApplicationContext contextClass = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = contextClass.getBean("person", Person.class);
        person.doSome();
        }
    }