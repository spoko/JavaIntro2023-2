package edu.methods;

import edu.oop.Dog;
import edu.oop.Pet;

public class MethodsDemo {

    public static void main(String[] args) {
        printNumbersToN(5);
        System.out.println(getTheSecret());
        sum(5,6);
        sum(7,4,6);
        sum(sum(5,2), sum(5,7,2));//homework 6 example

        Dog sharo = getADog("Sharo");
        Pet somePet = getADog("SomePetName");//Dog is a Pet
    }

    //this is a static method that won`t return any value. It will simply print in the console:
    public static void printNumbersToN(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    //method that will return a string
    public static String getTheSecret(){
        //local variable:
        String theSecret = "some big secret";
        return theSecret;
    }

    //method that will return an integer
    public static int sum(int a, int b){
        return a + b;
    }

    //method overload
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //method that will return an object
    public static Dog getADog(String name){
        return new Dog(name);
    }
}
