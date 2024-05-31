package ru.lukyanov.array.reversematrix;

public class App {

    public static void reverseMatrix(int[][] inMatrix) {
        int rows = inMatrix.length;
        int columns = inMatrix[0].length;
        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[j][i] = inMatrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        reverseMatrix(matrix);

    }

}
