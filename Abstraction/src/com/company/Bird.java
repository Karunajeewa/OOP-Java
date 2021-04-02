package com.company;

public class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Move to fly.");
    }

    @Override
    void eat() {
        System.out.println("Eat bird food.");
    }
}
