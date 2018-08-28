package com.company;

public class Cat extends Animals {
    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Yeah, I like the " + favToy);
    }

    //Overrides the super class's walkAround()
    public void walkAround(){
        System.out.println(this.getName() + "stalks around");
    }
    public String getToy(){
        return this.favToy;
    }


    public Cat(String name, String favFood, String favToy){
        super(name, favFood);
        this.favToy = favToy;
    }
}




