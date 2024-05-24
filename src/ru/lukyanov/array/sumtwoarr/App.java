package ru.lukyanov.array.sumtwoarr;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] sumarr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            sumarr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumarr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(sumarr));

        System.out.println("-------------------");

        int[] arr3 = {10, 20, 30};
        int[] arr4 = {40, 50, 60};
        int[] sumarr2 = new int[arr1.length + arr2.length];
        System.arraycopy(arr3, 0, sumarr2, 0, arr1.length);
        System.arraycopy(arr4, 0, sumarr2, arr3.length, arr2.length);
        System.out.println(Arrays.toString(sumarr2));
    }

}
