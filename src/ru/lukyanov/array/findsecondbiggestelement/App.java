package ru.lukyanov.array.findsecondbiggestelement;

import java.util.Arrays;

public class App {

    public static void findElementV1(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Второй по величине элемент: " + arr[arr.length - 2]);
    }

    public static void findElementV2(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Второй по величине элемент: " + max2);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4};
        findElementV2(arr);

    }
}
