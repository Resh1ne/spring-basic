package org.example;

public class Person {
    private Dog dog;
//    public Person() {
//        System.out.println("CONSTRUCTION DEFAULT " + getClass());
//    }

    public Person(Dog dog) {
        System.out.println("CONSTRUCTION ARGS " + getClass());
        this.dog = dog;
    }

    public void doSome() {
        System.out.println("Person do some...");
        dog.doSome();
    }

    public Dog getDog() {
        System.out.println("GETTER " + getClass());
        return dog;
    }

    public void setDog(Dog dog) {
        System.out.println("SETTER " + getClass());
        this.dog = dog;
    }
}
