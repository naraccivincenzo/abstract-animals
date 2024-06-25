package org.lessons.java.abstracts.animals;

public class Sparrow extends Animal {
    @Override
    public void eat() {
        System.out.println("The sparrow eats seeds");
    }

    @Override
    public void makeNoise() {
        System.out.println("The sparrow chirps");
    }
}
