package ru.lukyanov.collections.cleararraylist;

import java.util.*;

public class App {

    public static void clearArrayList(List<Integer> list) {
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer[] arr = new Integer[]{8,10};
        list.add(1);
        list.add(2);
        list.addAll(List.of(arr));
        clearArrayList(list);

//        List<Integer> unmodList1 = Arrays.asList(1,2,3);  //UnsupportedOperationException
//        clearArrayList(unmodList1);

//        List<Integer> unmodlist2 = List.of(4,5,6);  //UnsupportedOperationException ImmutableCollections
//        clearArrayList(unmodlist2);


    }
}
