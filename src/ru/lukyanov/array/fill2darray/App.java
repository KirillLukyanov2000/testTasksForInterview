package ru.lukyanov.array.fill2darray;

import java.util.Arrays;
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
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static void main(String[] args) {
        fill2dArray(5, 4);
    }
}
