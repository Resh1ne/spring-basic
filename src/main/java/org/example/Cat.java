package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    @Autowired
    public Cat() {
        System.out.println("CONSTRUCTION DEFAULT " + getClass());
    }

    public Cat(String name) {
        System.out.println("CONSTRUCTION ARGS " + getClass());
        this.name = name;
    }

    public void doSome() {
        System.out.printf("Cat %s do some...", name);
    }

    public String getName() {
        System.out.println("GETTER " + getClass());
        return name;
    }
    @Autowired
    @Value("${cat.name}")
    public void setName(String name) {
        System.out.println("SETTER " + getClass());
        this.name = name;
    }
}
