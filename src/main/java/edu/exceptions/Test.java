package edu.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws CookieMonsterException {

        //catching exceptions is giving us the ability to process the exception i.e. doing something
        try {
            ReadFile.readFile("/Users/minkovski/Desktop/SQL Training.sql");
        } catch (FileNotFoundException fnfe) {
            System.out.printf("Invalid full path file name: %s. Please provide full path to an existing file.\n",
                    fnfe.getMessage());
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }finally {
            System.out.println("I will be executed always :)");
        }

        System.out.println("--------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number a:");

        int a = sc.nextInt();

        System.out.println("Please enter a number b:");

        int b = sc.nextInt();

        try {
            System.out.printf("The result of the operation is: %d", a / b);
        }catch (ArithmeticException e){
            throw new CookieMonsterException(e.getMessage(), a);
        }
    }
}
