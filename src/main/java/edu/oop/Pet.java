package edu.oop;

public class Pet {
    public String breed;
    public String sex;
    public byte age;
    public String color;
    public float weight;
    public String name;

    //constructors
    public Pet(String breed, String sex, byte age, String color, float weight, String name){
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    //default constructor
    public Pet(){

    }

    //methods i.e. actions
    public void eat(){
        System.out.printf("%s is eating...\n", name);
    }

    public void makeSomeNoise(){
        System.out.printf("%s is making noise");
    }

    public void printData(){
        System.out.printf("%s is %d years old and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s.\n", name, age, weight, sex, color, breed);
    }
}
