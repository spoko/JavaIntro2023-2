package edu.operators;

import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printUserDetails(-1);
        printUserDetails(0);
        printUserDetails(2);
        printUserDetails(3);
        printUserDetails(12);
        printUserDetails(13);
        printUserDetails(19);
        printUserDetails(20);
        printUserDetails(65);
        printUserDetails(66);
        printUserDetails(130);
        printUserDetails(131);

        System.out.println("Please enter age:");

        int enteredAge = scanner.nextInt();
        printUserDetails(enteredAge);

        System.out.println("Please enter day of the week:");

        int enteredDay = scanner.nextInt();
        printDayOfTheWeek(enteredDay);
    }
    public static void printUserDetails(int age){
        //0 - 2 baby
        //kid 3 - 12
        //teenager 13 - 19
        //adult 20 - 65
        //retired 66 - 130

        if(age < 0){
            System.out.println("Invalid entry!!!");
            return;//this will stop execution of the following statements
        }

        if (age >= 0 && age <= 2){
            System.out.printf("Entered age was %d. The entered age corresponds to baby.\n", age);
        } else if (age >= 3 && age <= 12){
            System.out.printf("Entered age was %d. The entered age corresponds to kid.\n", age);
        } else if (age >= 13 && age <= 19) {
            System.out.printf("Entered age was %d. The entered age corresponds to teenager.\n", age);
        } else if (age >=20 && age <= 65) {
            System.out.printf("Entered age was %d. The entered age corresponds to adult.\n", age);
        } else if (age >= 66 && age <= 130) {
            System.out.printf("Entered age was %d. The entered age corresponds to retired.\n", age);
        }else {
            System.out.println("Vampire!!!");
        }
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.printf("Entered %d. You have selected Monday\n", day);
                break;
            case 2:
                System.out.printf("Entered %d. You have selected Tuesday\n", day);
                break;
            default:
                System.out.printf("Entered %d. Invalid selection\n", day);
        }
    }
}
