package edu.oop;

import edu.enumDemo.MonthsOfTheYear;

public class Cat extends Pet {
    //instance variable i.e. fields:
    public boolean hasTail; //specific characteristics for the Cat

    //properties i.e. setters and getters


    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    //constructors
    public Cat(Breed breed, String sex, byte age, String color, float weight,
               String name, Address address, boolean hasTail, MonthsOfTheYear birtMonth){
        super(breed, sex, age, color, weight, name, address, birtMonth);//calling constructor of the super (or parent) class
        this.hasTail = hasTail;
    }

    //default constructor
    public Cat(){}

    //methods i.e. actions
    public void makeSomeNoise(){
        System.out.printf("%s is meowing...\n", getName());
    }
    public void printData(){
        System.out.printf("%s is %d years old and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s.\n", getName(), getAge(), getWeight(), getSex(), getColor(), getBreed());
        if (hasTail){
            System.out.println("And it has tail.");
        }else {
            System.out.println("And it does not have tail.");
        }
    }
}
