package Arrays;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        System.out.print("Please enter the array (matrix) size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        // Write a program that asks for an integer `size` from the standard input,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        int[][] matrix = create(size);
        print(matrix);
    }

    public static int[][] create(int size) {
        // write your code to create an nxn matrix of the given size here
        // this matrix should already have value of 1 on the main diagonal
        int[][] outputMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    outputMatrix[i][j] = 1;
                } else {
                    outputMatrix[i][j] = 0;
                }
            }
        }

        return outputMatrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int column = 0; column < matrix[i].length; column++){
                System.out.print(matrix[i][column] + " ");
            }
            if(i != matrix.length -1){
                System.out.println();
            }
        }
        // write your code to print the given matrix
        // into the (standard) output here
    }
}
