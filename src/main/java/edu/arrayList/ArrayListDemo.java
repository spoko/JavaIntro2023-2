package edu.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Plovdiv");
        cities.add("Sofia");
        cities.add(1,"Burgas");
        cities.add(2,"Varna");

        System.out.printf("The cities are: %s and the count is: %d", cities, cities.size());
    }
}
