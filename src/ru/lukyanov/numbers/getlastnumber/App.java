package ru.lukyanov.numbers.getlastnumber;

public class App {

    public static void main(String[] args) {
        int number = 36789;
        int lastNumber;
        while (number != 0) {
            lastNumber = number % 10;
            number /= 10;
            System.out.println(lastNumber);
        }
    }

}
