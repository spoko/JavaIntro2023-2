package edu.oop;

public class Dog extends Pet{
    public boolean hasTail; //specific characteristics for the Dogs
    //constructors
    public Dog(String breed, String sex, byte age, String color, float weight,
               String name, boolean hasTail){
        super(breed, sex, age, color, weight, name);//calling constructor of the super (or parent) class
        this.hasTail = hasTail;
    }

    //default constructor
    public Dog(){
        super();//calling constructor of the super (or parent) class
    }

    //methods i.e. actions
    @Override
    public void makeSomeNoise() {
        System.out.printf("%s is braking...\n", name);
    }

    public void printData(){
        System.out.printf("%s is %d years old and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s. ", name, age, weight, sex, color, breed);
        if (hasTail){
            System.out.println("And it has tail.");
        }else {
            System.out.println("And it does not have tail.");
        }
    }
}