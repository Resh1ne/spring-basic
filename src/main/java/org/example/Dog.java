package org.example;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("CONSTRUCTION DEFAULT " + getClass());
    }

    public Dog(String name) {
        System.out.println("CONSTRUCTION ARGS " + getClass());
        this.name = name;
    }

    public void doSome() {
        System.out.printf("Dog %s do some...", name);
    }

    public String getName() {
        System.out.println("GETTER " + getClass());
        return name;
    }

    public void setName(String name) {
        System.out.println("SETTER " + getClass());
        this.name = name;
    }
}
