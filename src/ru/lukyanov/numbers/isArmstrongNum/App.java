package ru.lukyanov.numbers.isArmstrongNum;

import java.util.Objects;
import java.util.Set;

public class App {

    public static void isArmstrongNumberV1(int num) {
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

    public static void isArmstrongNumberV2(int num) {
        int x = 0, y = 0, temp = 0, itr = 0;
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            ++itr;
        }
//        String length = String.valueOf(num);
//        itr = length.length();
        temp = num;
        while (temp > 0) {
            x = temp % 10;
            temp = temp / 10;
            y = (int) (y + Math.pow(x, itr));
        }
        if (num == y)
            System.out.println(num + " Данное число является числом Армстронга");
        else
            System.out.println(num + " Данное число не является числом Армстронга");
    }

    public static void checkArmstrongNum100to999(int limit) {
        int start = 0;
        while (start <= limit) {
            isArmstrongNumberV1(start);
            start++;
        }
    }

    public static void main(String[] args) {
        isArmstrongNumberV1(371);
        isArmstrongNumberV2(1634);
        checkArmstrongNum100to999(372);

    }

}
