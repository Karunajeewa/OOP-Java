package com.company;

abstract class Animal {
    // abstraction method
    abstract void move();
    abstract void eat();

    //concrete method
    void label (String name){
        System.out.println("Animal's Data : "+name);
    }
}

