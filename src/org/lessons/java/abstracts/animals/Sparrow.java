package org.lessons.java.abstracts.animals;

public class Sparrow extends Animal implements IFlyer {
    @Override
    public void eat() {
        System.out.println("The sparrow eats seeds");
    }

    @Override
    public void makeNoise() {
        System.out.println("The sparrow chirps");
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
