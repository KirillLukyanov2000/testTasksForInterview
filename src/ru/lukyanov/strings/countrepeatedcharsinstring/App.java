package ru.lukyanov.strings.countrepeatedcharsinstring;

public class App {

    public static void countChars(String str) {
        int[] charCounts = new int[256]; // создаем массив для всех символов ASCII таблицы
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++; // увеличиваем счетчик в массиве
        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char)i + " : повторяется " + charCounts[i] + " раз(а)"); // выводим результат для каждого символа с количеством вхождений больше 1

            }
        }
    }

    public static void main(String[] args) {
        String str = "How to count chars in a String?";
        countChars(str);
    }
}
