package ru.lukyanov.strings.countrepeatedcharsinstring;

public class App {

    public static void countCharsV1(String str) {
        int[] charCounts = new int[256]; // создаем массив для всех символов ASCII таблицы
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++; // увеличиваем счетчик в массиве
        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + " : повторяется " + charCounts[i] + " раз(а)"); // выводим результат для каждого символа с количеством вхождений больше 1

            }
        }
    }

    public static void countCharsV2(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "How to count chars in a String?";
        countCharsV1(str);
        String str2 = "Hello World";
        countCharsV2(str2);
    }
}
