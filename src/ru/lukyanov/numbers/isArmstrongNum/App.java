package ru.lukyanov.numbers.isArmstrongNum;

import java.util.Set;

public class App {

    public static void isArmstrongNumber(int num) {
        int x = 0, y = 0, temp = 0;
        temp = num;
        while (num > 0) {
            x = num % 10;
            num = num / 10;
            y = y + (x * x * x);
        }
        if (temp == y)
            System.out.println(temp + " Данное число является числом Армстронга");
        else
            System.out.println(temp + " Данное число не является числом Армстронга");
    }

    public static void checkArmstrongNum(int limit) {
        int start = 0;
        while (start <= limit) {
            isArmstrongNumber(start);
            start++;
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(371);
        checkArmstrongNum(371);
    }

}
