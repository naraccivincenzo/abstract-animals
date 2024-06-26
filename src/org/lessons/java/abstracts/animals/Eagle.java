package org.lessons.java.abstracts.animals;

public class Eagle extends Animal implements IFlyer {
    @Override
    public void eat() {
        System.out.println("The eagle eats meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("The eagle screech");
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
