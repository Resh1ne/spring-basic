package org.example;

public class Person {
    private Dog dog;
    private Cat cat;
    public Person() {
        System.out.println("CONSTRUCTION DEFAULT " + getClass());
    }

    public Person(Dog dog, Cat cat) {
        System.out.println("CONSTRUCTION ARGS " + getClass());
        this.dog = dog;
        this.cat = cat;
    }

    public void doSome() {
        System.out.println("Person do some...");
        dog.doSome();
        cat.doSome();
    }

    public Dog getDog() {
        System.out.println("GETTER " + getClass());
        return dog;
    }

    public void setDog(Dog dog) {
        System.out.println("SETTER " + getClass());
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
