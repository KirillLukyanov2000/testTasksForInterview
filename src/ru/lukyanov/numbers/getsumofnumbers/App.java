package ru.lukyanov.numbers.getsumofnumbers;

public class App {

    public static void main(String[] args) {
        int number = 36789;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
