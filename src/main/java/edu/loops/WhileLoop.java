package edu.loops;

public class WhileLoop {

    public static void main(String[] args) {
        printFactorial(5);
        printFactorial(10);
        printFactorial(3);
        printFactorial(0);
        printFactorial(1);
        printFactorial(-2);

        printNumbersToN(7);
    }

    //will print n! (factorial in the console)
    public static void printFactorial(int n){
        if (n < 0){
            System.out.println("Invalid input");
            return;
        }

        //local variables
        int iterator = n;
        int factorial = 1;

        //while loop
        while (iterator > 0){
            factorial *= iterator;
            iterator--;
        }

        System.out.printf("You entered %d. %d! = %d\n", n, n, factorial);
    }

    public static void printNumbersToN(int n){
        if (n < 0){
            System.out.println("Invalid input. This method allows positive numbers only!");
            return;
        }

        int counter = 0;

        while (counter != n + 1){
            System.out.println(counter);
            counter++;
        }
    }
}
