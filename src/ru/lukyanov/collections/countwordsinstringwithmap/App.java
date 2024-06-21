package ru.lukyanov.collections.countwordsinstringwithmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

    public static void countWords(String str) {
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
            else {
                int count = map.get(arr[i]);
                map.put(arr[i],++count);
            }
        }
        System.out.println(map);
    }

    public static void iterMap() {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"str1");
        integerStringMap.put(2,"str2");
        integerStringMap.put(3,"str3");

        for (Map.Entry<Integer, String> integerStringEntry : integerStringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }

        Iterator iterator = integerStringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry <Integer, String> count = (Map.Entry) iterator.next();
            System.out.println(count.getKey() + " " + count.getValue());
        }

        for (Integer i : integerStringMap.keySet()) {
            System.out.println(integerStringMap.get(i));
        }
    }

    public static void main(String[] args) {
String str = "Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap. Напишите программу на Java";
    countWords(str);
    iterMap();
    }

}
