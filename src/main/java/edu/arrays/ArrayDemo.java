package edu.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 2, 6, 78, 4, 5};
        int [] numbers2 = new int[7];

        String [] cities = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String [] cities2 = new String[20];

        boolean [] answers = new boolean[10];
        boolean [] answers2 = {true, false, true, false};

        //Random access of the elements of the array:
        System.out.println(numbers[3]);
        System.out.println(numbers2[3]);

        System.out.println(cities[cities.length - 1]); //this will access last element of the array

        System.out.println("------------");
        printElements(numbers);

        System.out.println("------------");
        printElements(cities);

        System.out.println("------------");
        printElements(answers2);

        System.out.println("-------------");
        System.out.println(answers);
    }

    public static void printElements(int [] elements){
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Current index is: %d. Value is: %d\n", i, elements[i]);
        }
    }

    public static void printElements(String [] elements){
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Current index is: %d. Value is: %s\n", i, elements[i]);
        }
    }

    public static void printElements(boolean [] elements){
        for (boolean element : elements) {
            System.out.printf("Current element is: %b\n", element);
        }
    }
}
