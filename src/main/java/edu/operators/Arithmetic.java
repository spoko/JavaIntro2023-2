package edu.operators;

public class Arithmetic {
    public static void main(String[] args) {
        //local variables:
        int a = 9;
        int b = 2;
        int c = 10;
        double result;

        System.out.println(a % b); //what will remain after whole number division

        System.out.println(a);//will print 9
        System.out.println(++a);//will print 10
        System.out.println(a);//will 10

        System.out.println(a++);//will print 10
        System.out.println(a);//will print 11

        System.out.println(a + b);
        System.out.println(a / b);

        //cast from int to double i.e. converting data types
        result = (double) a / b;
        System.out.println(result);
        System.out.println(a - b);
        System.out.println(a * b);

        c += a;
        System.out.println(c);
    }


}
