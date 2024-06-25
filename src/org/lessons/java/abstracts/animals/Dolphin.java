package org.lessons.java.abstracts.animals;

public class Dolphin extends Animal {
    @Override
    public void eat() {
        System.out.println("The dolphin eats fishes");
    }

    @Override
    public void makeNoise() {
        System.out.println("The dolphin sings");
    }
}
