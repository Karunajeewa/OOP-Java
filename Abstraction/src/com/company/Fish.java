package com.company;

public class Fish extends Animal{
    @Override
    void move() {
        System.out.println("Move to swimming");
    }

    @Override
    void eat() {
        System.out.println("Eat fish food");
    }
}
