package ru.lukyanov.collections.listiterations;

import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = List.of("aq", "aw", "zz", "zzz");

        System.out.println("Цикл For:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Обратный цикл For:");
        for (int i = list.size() - 1; i > -1; i--) {
            System.out.println(list.get(i));
        }

        System.out.println("Улучшенный цикл For:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Цикл While:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
