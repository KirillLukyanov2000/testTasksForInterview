package ru.lukyanov.numbers.finddivisors;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void findDivisors(int num) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        findDivisors(50);
    }

}
