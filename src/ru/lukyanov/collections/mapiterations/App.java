package ru.lukyanov.collections.mapiterations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

    public static void iterMap(Map<Integer, String> integerStringMap) {

        for (Map.Entry<Integer, String> integerStringEntry : integerStringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }
        System.out.println();
        Iterator<Map.Entry<Integer, String>> iterator = integerStringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "str1");
        integerStringMap.put(2, "str2");
        integerStringMap.put(3, "str3");
        iterMap(integerStringMap);
    }
}
