package ru.lukyanov.numbers.isaprime;

public class App {

    public static void isAPrime(int number) {
        int tempNumber;
        boolean numberIsPrime = true;

        for (int x = 2; x <= number / 2; x++) {
            tempNumber = number % x;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if (numberIsPrime)
            System.out.println(number + " - число является простым");
        else
            System.out.println(number + " - число не является простым");
    }

    public static void main(String[] args) {
        isAPrime(1);
    }
}
