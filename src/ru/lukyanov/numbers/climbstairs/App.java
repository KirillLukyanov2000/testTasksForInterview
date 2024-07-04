package ru.lukyanov.numbers.climbstairs;

public class App {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int num) {
        if (num == 1) return 1;
        int prevStep = 1;
        int currStep = 2;

        for (int i = 3; i <= num; i++) {
            int nextStep = currStep + prevStep;
            prevStep = currStep;
            currStep = nextStep;

        }
        return currStep;
    }
}
