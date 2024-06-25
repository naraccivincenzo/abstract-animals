package org.lessons.java.abstracts.animals;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks");
    }
}
