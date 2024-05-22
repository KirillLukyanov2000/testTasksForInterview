package ru.lukyanov.numbers.countfactorial;

public class App {

    public static int countFactorialV1(int num) {
        if (num < 1) return 1; return num * countFactorialV1((num-1));
    }

    public static int countFactorialV2(int num) {
        int n = 1;
        for(int i = 1; i <= num; i++) n = n*i;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(countFactorialV2(5));
    }
}
