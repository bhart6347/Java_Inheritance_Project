package com.company;

public class Main {
    public static void main(String[] args){

        Animals genericAnimal = new Animals();
        Cat kit = new Cat("kit","Kits and Bits","Rubber Mouse");

        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);
        genericAnimal.eatStuff();
        genericAnimal.walkAround();
        System.out.println("=================================");
        System.out.println("This is the Cat class object which extends the Animal Class");
        kit.playWith();






    }
}
