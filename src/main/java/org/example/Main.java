//location of the current class
package org.example;

//When we want to use something built-in we shall import it
import java.util.Scanner;

//definition of a class
public class Main {
    //main method :) (entry point i.e. starting point of execution of our program)
    public static void main(String[] args) {

        //Working with the standard output so-called Console - printing some text
        System.out.println("Please enter your name:");

        //Class Scanner - giving us the possibility to work with standard input (from the Console)
        Scanner scanner = new Scanner(System.in);
        //Creating a variable (userName) which will hold a text value(the name)
        String userName = scanner.nextLine();

        //Working with the standard output so-called Console - printing some text
        System.out.println("Please enter your age:");
        //Creating a variable (userAge) which will hold a number value(the age)
        int userAge = scanner.nextInt();

        //logical operator - checks if the checks is either true or false
        if (userAge > 17){
            //will execute this section if true:
            System.out.println("Hello " + userName + ". Nice to meet you! You can vote since you are " +
                    userAge + " years old.");
        }else {
            //will execute this section if false:
            System.out.println("Hello " + userName + ". Nice to meet you! You can't vote since you are " +
                    userAge + " years old.");
        }
    }
}