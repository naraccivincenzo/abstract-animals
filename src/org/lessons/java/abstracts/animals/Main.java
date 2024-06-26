package org.lessons.java.abstracts.animals;

public class Main {

    private static void doFLy(IFlyer animal) {
        animal.fly();
    }

    private static void doSwim(ISwimmer animal) {
        animal.swim();
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();

        dog.makeNoise();
        dog.eat();
        dog.sleep();

        dolphin.makeNoise();
        dolphin.eat();
        dolphin.sleep();

        eagle.makeNoise();
        eagle.eat();
        eagle.sleep();

        sparrow.makeNoise();
        sparrow.eat();
        sparrow.sleep();

        doSwim(dolphin);
        doFLy(eagle);
        doFLy(sparrow);
    }


}
