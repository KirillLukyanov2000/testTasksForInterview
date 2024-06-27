package ru.lukyanov.numbers.reverseinteger;

public class App {

    public static void main(String[] args) {
        System.out.println(revInteger(-12345L));
    }

    public static Integer revInteger(Long number) {
        long num = number;
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) return 0;
        StringBuilder stringBuilder;
        if (num < 0) {
            num = -num;
            stringBuilder = new StringBuilder(String.valueOf(num));
            stringBuilder.reverse();
            return Integer.parseInt(stringBuilder.toString()) * -1;
        } else {
            stringBuilder = new StringBuilder(String.valueOf(num));
            stringBuilder.reverse();
        }
        return Integer.valueOf(stringBuilder.toString());
    }

}
