package ru.lukyanov.various;

import java.util.*;

public class Test {

    public static void isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("false");
            }

        }
    }

    public static void isArmstrong(int num) {

    }

    public static void isFib(int num) {

    }

    public static void changeTwoNum1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }

    public static void changeTwoNum2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void findSecElem(int[] arr) {

    }

    public static void isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String string = stringBuilder.reverse().toString();
        System.out.println(str.equals(string));
    }

    public static void checkPalindr(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                System.out.println(false);
        }
    }

    public static void revStr(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(str.length() - 1 - i));
            System.out.print(str.charAt(str.length() - 1 - i));
        }
        System.out.println();
        System.out.println(stringBuilder);
    }

    public static void revStringArr(String str) {
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] array = list.toArray(arr);
        StringBuilder bldr = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            bldr.append(array[i]);

        }
        String rev = bldr.toString();
        System.out.println(rev);
    }

    public static void revArr(String str) {
        char[] charArray1 = str.toCharArray();
        for (int i = 0; i < charArray1.length / 2; i++) {
            char temp = charArray1[i];
            charArray1[i] = charArray1[charArray1.length - 1 - i];
            charArray1[charArray1.length - 1 - i] = temp;
        }
        System.out.println(new String(charArray1));
    }

    public static void revMatrix(int[][] matr) {
        int rows = matr.length;
        int columns = matr[0].length;
        int[][] matr2 = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matr2[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < matr2.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr2[i][j]);

            }
            System.out.println();
        }
    }

    public static void countRepeatedWords(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!map.containsKey(split[i])) {
                map.put(split[i], 1);
            } else {
                int count = map.get(split[i]);
                map.put(split[i], ++count);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    public static void iterMap() {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"str1");
        integerStringMap.put(2,"str2");
        integerStringMap.put(3,"str3");

        for (Map.Entry<Integer, String> integerStringEntry : integerStringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> iterator = integerStringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }

    public static void bubSort(int[] arr) {

        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        isPrime(11);
        revStringArr("ИНТЕРВЬЮ ДЛЯ JAVA РАЗРАБОТЧИКА");
        revStr("ИНТЕРВЬЮ ДЛЯ JAVA РАЗРАБОТЧИКА");
//        isFib(6);
        changeTwoNum1(1, 2);
        changeTwoNum2(1, 2);
        countRepeatedWords("В этой программе мы используем арифметические операции сложения и вычитания, чтобы поменять значения местами. Сначала мы добавляем значения a и b и присваиваем результат a. Затем мы вычитаем значение b из a и присваиваем результат b. Наконец, мы вычитаем значение b из a и присваиваем результат a. Таким образом, значения a и b меняются местами");
        iterMap();
           int[] arr = {3, 2, 5, 1, 4, 8, 20, -10};
           bubSort(arr);
//        findSecElem(arr);
//        isArmstrong(371);
//isPalindrome("TeneT");
//revArr("TeneT");
//checkPalindr("Tenet");
    }
}
