package edu.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int someRandomNumber = 13;

        do{
            System.out.printf("Current number is: %d\n", someRandomNumber);
            someRandomNumber++;
        }while (someRandomNumber >=20);
    }
}
