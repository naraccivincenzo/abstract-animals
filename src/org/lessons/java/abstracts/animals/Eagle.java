package org.lessons.java.abstracts.animals;

public class Eagle extends Animal {
    @Override
    public void eat() {
        System.out.println("The eagle eats meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("The eagle screech");
    }
}
