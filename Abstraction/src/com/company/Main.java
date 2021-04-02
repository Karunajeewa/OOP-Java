package com.company;

public class Main {

    public static void main(String[] args) {

        Animal bird = new Bird();
            bird.label("Bird");
            bird.move();
            bird.eat();
        System.out.println(" ");
        Animal fish = new Fish();
            fish.label("Fish");
            fish.move();
            fish.eat();
    }
}
