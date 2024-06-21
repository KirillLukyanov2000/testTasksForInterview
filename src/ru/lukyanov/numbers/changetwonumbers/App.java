package ru.lukyanov.numbers.changetwonumbers;

public class App {
    public static void changeTwoNumbersV1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void changeTwoNumbersV2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        changeTwoNumbersV1(10, 20);
        changeTwoNumbersV2(10, 20);
    }

}
