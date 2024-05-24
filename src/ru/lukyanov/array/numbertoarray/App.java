package ru.lukyanov.array.numbertoarray;

import java.util.Arrays;

public class App {

    public static void numberToArray(int num) {
        String l = String.valueOf(num);
        String l1 = l + "a"; // throws NumberFormatException: Not a number!
        char[] a = l1.toCharArray();
        int[] arr = new int[l1.length()];
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(a[i])) {
                arr[i] = Character.getNumericValue(a[i]);
            } else {
                throw new NumberFormatException("Not a number!");
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        numberToArray(12345);


    }
}
