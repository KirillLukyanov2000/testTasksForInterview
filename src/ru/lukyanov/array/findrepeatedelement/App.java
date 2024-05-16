package ru.lukyanov.array.findrepeatedelement;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void findElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println("Повторяющийся элемент: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3};
        findElement(arr);
    }
}
