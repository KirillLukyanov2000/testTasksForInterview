package ru.lukyanov.array.numbertoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void numberToArray(int num) {
        String l = String.valueOf(num);
        char[] a = l.toCharArray();
        int[] arr = new int[l.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(a[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        numberToArray(12345);


    }
}
