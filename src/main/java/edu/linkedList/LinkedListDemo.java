package edu.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Honda");
        cars.add(0, "Volvo");
        cars.add("Toyota");

        System.out.println("Available cars are: " + cars);

        //"sell" a car:
        cars.remove("BMW");
        cars.remove(3);

        System.out.println("Available cars after the sells are: " + cars);
    }
}
