package com.company;

public class Animals {
    private String name = "Animal";
    public String favFood = "Food";

    public Animals() {

    }

    protected final void changeName(String newName){
        this.name = newName;
    }

    protected final String getName(){
        return this.name;
    }

    public void eatStuff(){
        System.out.println("Yum " + favFood);
    }

    public void walkAround(){
        System.out.println(this.name + " walks around");
    }

    public Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }


}
