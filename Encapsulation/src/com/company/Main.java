package com.company;

public class Main {

    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        newAnimal.setName("Tomi");
        newAnimal.setAverageWeight(1.6);
        newAnimal.setNumberOfLegs(4);

        System.out.println("Name : "+newAnimal.getName());
        System.out.println("Average weight : "+ newAnimal.getAverageWeight());
        System.out.println("Legs : "+ newAnimal.getNumberOfLegs());
    }
}
