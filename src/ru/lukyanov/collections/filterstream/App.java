package ru.lukyanov.collections.filterstream;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("CA");

        List<String> a = list.stream().filter(el -> el.contains("A")).toList();

        System.out.println(a);
    }
}
