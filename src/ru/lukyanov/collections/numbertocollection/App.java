package ru.lukyanov.collections.numbertocollection;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int num = 12345;
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        System.out.println(list.reversed());
    }

}
