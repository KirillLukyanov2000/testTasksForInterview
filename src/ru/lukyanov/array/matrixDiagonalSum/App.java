package ru.lukyanov.array.matrixDiagonalSum;

public class App {
    public static int countDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sum += matrix[i][i];
            if (j != i) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(countDiagonalSum(arr1));

        int[][] arr2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        System.out.println(countDiagonalSum(arr2));

        int[][] arr3 = {{5}};
        System.out.println(countDiagonalSum(arr3));
    }
}
