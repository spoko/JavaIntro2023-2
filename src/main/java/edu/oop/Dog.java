package edu.oop;

import edu.enumDemo.MonthsOfTheYear;

public class Dog extends Pet{
    //instance variable i.e. fields:
    private boolean hasTail; //specific characteristics for the Dogs

    //properties i.e. setters and getters
    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    //constructors
    public Dog(Breed breed, String sex, byte age, String color, float weight,
               String name, Address address, boolean hasTail, MonthsOfTheYear birtMonth){
        super(breed, sex, age, color, weight, name, address, birtMonth);//calling constructor of the super (or parent) class
        this.hasTail = hasTail;
    }

    public Dog(String name){
        setName(name);
    }

    //default constructor
    public Dog(){
        super();//calling constructor of the super (or parent) class
    }

    //methods i.e. actions
    @Override
    public void makeSomeNoise() {
        System.out.printf("%s is braking...\n", getName());
    }

    public void printData(){
        System.out.printf("%s is %d years old and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s. ", getName(), getAge(), getWeight(), getSex(), getColor(), getBreed());
        if (hasTail){
            System.out.println("And it has tail.");
        }else {
            System.out.println("And it does not have tail.");
        }
    }
}