package ru.lukyanov.collections.reversemultimapwithstreamapi;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Map<Integer, List<Long>> inputMap = new HashMap<>();
        inputMap.put(1, Arrays.asList(0L, 1L, 2L));
        inputMap.put(2, Arrays.asList(3L, 4L));

        Map<Long, Integer> outputMap = inputMap.entrySet().stream().flatMap(
                entry -> {
                    var key = entry.getKey();
                    var value = entry.getValue();
                    return value.stream().map(num -> Map.entry(num, key));
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(outputMap);
    }

}
