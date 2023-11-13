package edu.arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [][] matrix = {
                {3, 5, 56, 2, 75, 3},
                {4, 2, 5},
                {9, 20, 233, 4}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("Element in position %d%d is %d\n", i, j, matrix[i][j]);
            }
        }
    }
}
