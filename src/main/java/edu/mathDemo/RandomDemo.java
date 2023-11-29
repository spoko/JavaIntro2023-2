package edu.mathDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(0, 100));
        System.out.println(random.nextInt(10));
    }

}
