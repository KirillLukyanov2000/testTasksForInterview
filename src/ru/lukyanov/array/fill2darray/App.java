package ru.lukyanov.array.fill2darray;

import java.util.Random;

public class App {

    public static void fill2dArray(int a, int b) {
        int[][] nums = new int[a][b];
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                nums[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void reverse2dArray(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fill2dArray(5, 4);
        int[][] arr = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        reverse2dArray(arr);
    }
}
