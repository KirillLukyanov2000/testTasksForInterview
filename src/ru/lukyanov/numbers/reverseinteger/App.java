package ru.lukyanov.numbers.reverseinteger;

public class App {

    public static void main(String[] args) {
        System.out.println(revIntegerV1(-12345L));
        System.out.println(revIntegerV2(-1234567));
    }

    public static Integer revIntegerV1(Long number) {
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

    private static Integer revIntegerV2(int num) {
        int res = 0;
        while (num != 0) {
            int module = num % 10;
            if ((res > Integer.MAX_VALUE / 10) || (res == Integer.MAX_VALUE / 10 && module > 7)) {
                return 0;
            }
            if ((res < Integer.MIN_VALUE / 10) || (res == Integer.MIN_VALUE / 10 && module < -8)) {
                return 0;
            }
            res *= 10;
            res += module;
            num = num / 10;

        }
        return res;
    }

}
