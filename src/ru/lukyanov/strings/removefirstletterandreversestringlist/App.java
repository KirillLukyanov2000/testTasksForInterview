package ru.lukyanov.strings.removefirstletterandreversestringlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static List<String> processTheList(List<String> nameList) {
        return nameList.stream()
                .map(x -> x.substring(1))
                .sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList();
        nameList.add("John");
        nameList.add("Bob");
        nameList.add("Anna");
        nameList.add("Dmitriy");
        nameList.add("Peter");
        nameList.add("David");
        nameList.add("Igor");

        System.out.println(processTheList(nameList));
    }
}
