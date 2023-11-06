package edu.datatypes;

public class Dog {
    //instance variables:
    byte age;
    String name;
    boolean isFemale;
    //class or static variable
    public static String breed = "French Bulldog";

    public void printDogData(){
        System.out.println(name + " is " + age + " years old.");

        if (this.isFemale){
            System.out.println("Sex of " + name + " is female");
        }else {
            System.out.println("Sex of " + name + " is male");
        }
    }
}
