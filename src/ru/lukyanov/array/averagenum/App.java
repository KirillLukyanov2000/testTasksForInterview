package ru.lukyanov.array.averagenum;

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 13, 1, -1210};
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / arr.length);
    }
}
