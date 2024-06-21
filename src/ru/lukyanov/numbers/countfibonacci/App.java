package ru.lukyanov.numbers.countfibonacci;

public class App {

    public static void countFibonacci(int num) {
        int x = 0, y = 0, z = 1;
        System.out.println("Серия чисел Фибоначчи: ");

        for (int i = 0; i <= num; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        countFibonacci(46);
    }

}
