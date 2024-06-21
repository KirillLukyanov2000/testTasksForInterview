package ru.lukyanov.numbers.isaprime;

import java.math.BigInteger;

public class App {

    public static void isAPrimeVar1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("false " + number);
            }
        }
    }

    public static void isAPrimeVar2(int number) {
        BigInteger bigInteger = new BigInteger(String.valueOf(number));
        System.out.println(bigInteger.isProbablePrime(1) + " " + number);
    }

    public static void soutAllPrimeNums(int num) {
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1)
                System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        isAPrimeVar1(4);
        isAPrimeVar2(5);
        soutAllPrimeNums(53);
    }
}
