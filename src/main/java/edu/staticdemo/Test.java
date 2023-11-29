package edu.staticdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Number of all cars created is: " + Car.getCounter());

        Car audi80 = new Audi("Audi 80");
        //Car vwGolfI = new Car("VW Golf I"); //cannot have object from an abstract class
        //Car vwGolfII = new Car("VW Golf II"); //cannot have object from an abstract class

        System.out.println("Number of all cars created is: " + Car.getCounter());

        //we cannot change the name of a final variable i.e. constant
        //vwGolfII.FACTORY_NAME = "Test";

    }
}
