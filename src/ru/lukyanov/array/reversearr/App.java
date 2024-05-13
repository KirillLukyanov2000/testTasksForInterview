package ru.lukyanov.array.reversearr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static Integer[] reverseVar1(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray(arr);
    }
    public static Integer[] reverseVar2(Integer[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverseVar1(arr)));
    }
}
