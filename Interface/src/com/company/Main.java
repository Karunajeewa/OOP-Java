package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle myEagle = new Eagle();
            myEagle.eat();
            myEagle.fly();
            myEagle.sound();

        System.out.println("Number of legs: " + Bird.numberOfLeges);
        System.out.println("Outer covering: " + Bird.outCovering);
    }
}
