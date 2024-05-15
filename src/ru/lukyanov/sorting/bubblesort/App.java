package ru.lukyanov.sorting.bubblesort;

import java.util.Arrays;

public class App {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {234, 33, 123, 4, 5342, 76, 3, 65,
                3, 5, 35, 75, 255, 4, 46, 48, 4658, 44, 22,
                678, 324, 66, 151, 268, 433, 76, 372, 45, 13,
                9484, 499959, 567, 774, 473, 3, 32, 865, 67, 43,
                63, 332, 24, 1};
        bubbleSort(arr);
    }
}
