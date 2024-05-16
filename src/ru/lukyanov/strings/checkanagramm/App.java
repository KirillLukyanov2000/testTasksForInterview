package ru.lukyanov.strings.checkanagramm;

public class App {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) { // если длины строк не равны, они не могут быть анаграммами
            return false;
        }
        int[] charCounts = new int[256]; // создаем массив для всех символов ASCII таблицы
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCounts[c]++; // увеличиваем счетчик в массиве для символов первой строки
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (--charCounts[c] < 0) { // уменьшаем счетчик в массиве для символов второй строки и проверяем, что он не станет отрицательным
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Tenet";
        String str2 = "Ttnee";
        System.out.println(checkAnagram(str1, str2));
    }

}
