package edu.loops;

public class ForLoop {
    public static void main(String[] args) {
        int n = 20;

        for(int i = 1; i <= n; ++i){
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }
}
