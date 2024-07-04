package ru.lukyanov.collections.removeduplicatesfromlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static List<String> removeDup(List<String> list) {
        if (list == null) throw new UnsupportedOperationException("List is null");
        Set<String> set = new TreeSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("20");
        list.add("10");
        list.add("10");

        System.out.println(removeDup(list));
    }

}
