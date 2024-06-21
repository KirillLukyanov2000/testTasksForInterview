package ru.lukyanov.strings.removefirstletterandreversestringlist;

import java.util.*;

public class App {
    public static List<String> processTheList(List<String> nameList) {
        return nameList.stream()
                .map(x -> x.substring(1))
                .sorted(Comparator.reverseOrder()).toList();
    }

    public static List<String> processTheList2(List<String> nameList) {
        List<String> newNameList = new ArrayList<>();
        for (String s : nameList) {
            String substring = s.substring(1);
            newNameList.add(substring);
        }
        newNameList.sort(Comparator.reverseOrder());
        return newNameList;
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Bob");
        nameList.add("John");
        nameList.add("Anna");
        nameList.add("Dmitriy");
        nameList.add("Peter");
        nameList.add("David");
        nameList.add("Igor");

        System.out.println(processTheList(nameList));
        System.out.println(processTheList2(nameList));
    }

}
