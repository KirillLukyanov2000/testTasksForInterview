package ru.lukyanov.numbers.isaprime;

import java.math.BigInteger;
import java.util.Arrays;

public class App {

    public static void isAPrimeVar1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("false");
            }
        }
    }

    public static void isAPrimeVar2(int number) {
        BigInteger bigInteger = new BigInteger(new String(String.valueOf(number)));
        System.out.println(bigInteger.isProbablePrime(1));
    }

    public static void main(String[] args) {
        isAPrimeVar1(4);
    }
}
