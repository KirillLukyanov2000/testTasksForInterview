package ru.lukyanov.collections.countwordsinstringwithmap;

import java.util.HashMap;
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

    public static void main(String[] args) {
String str = "Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap. Напишите программу на Java";
    countWords(str);
    }
}
