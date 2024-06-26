package ru.lukyanov.collections.genericlisttoarr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String[] strings = convert(String.class, List.of("V1", "V2", "V3"));
        System.out.println(Arrays.toString(strings));
    }

    public static <T> T[] convert(Class<T> clazz, List<T> values) {
        T[] arr = (T[]) Array.newInstance(clazz, values.size());
        for (int i = 0; i < values.size(); i++) {
            arr[i] = values.get(i);
        }
        return arr;
    }

}
