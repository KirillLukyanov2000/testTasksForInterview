package ru.lukyanov.array.arraysintersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void findIntersections(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        findIntersections(arr1, arr2);
    }
}
