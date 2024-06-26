package ru.lukyanov.array.shufflearray;

import java.security.SecureRandom;

public class App {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        shuffleArray(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void shuffleArray(int[] arr) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = secureRandom.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}

