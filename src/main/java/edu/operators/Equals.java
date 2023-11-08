package edu.operators;

public class Equals {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 10;
        int z = 8;

        System.out.println(a == b);//true
        System.out.println(a == z);//false

        System.out.println(a != b);//false
        System.out.println(c != z);//true
    }
}
