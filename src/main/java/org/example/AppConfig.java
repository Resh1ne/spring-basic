package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:/settings.properties")
public class AppConfig {

    @Bean
    public Dog dog(@Value("${dog.name}") String name) {
        Dog dog = new Dog();
        dog.setName(name);
        return dog;
    }

    @Bean
    public Person person(Dog dog, Cat cat) {
        return new Person(dog, cat);
    }
}
