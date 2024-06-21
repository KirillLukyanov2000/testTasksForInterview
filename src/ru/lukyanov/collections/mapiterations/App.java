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

        integerStringMap.entrySet().removeIf(next -> next.getValue().contains("str1"));
        System.out.println(integerStringMap);

        Iterator<Map.Entry<Integer, String>> iterator2 = integerStringMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> next = iterator2.next();
            if (next.getValue().contains("str2")) {
                iterator2.remove();
            }
        }
        System.out.println(integerStringMap);
    }

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "str1");
        integerStringMap.put(2, "str2");
        integerStringMap.put(3, "str3");
        iterMap(integerStringMap);
    }
}
