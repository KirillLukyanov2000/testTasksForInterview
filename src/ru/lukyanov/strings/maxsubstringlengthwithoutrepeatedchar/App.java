package ru.lukyanov.strings.maxsubstringlengthwithoutrepeatedchar;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // множество для хранения уникальных символов
        int left = 0; // левый указатель
        int right = 0; // правый указатель
        int maxLen = 0; // длина максимальной подстроки без повтора символов
        while (right < s.length()) { // пока правый указатель не достиг конца строки
            // если символ не повторяется, добавляем его в множество и расширяем окно
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, set.size()); // обновляем максимальную длину подстроки при необходимости
            } else { // если символ уже есть в множестве, сужаем окно
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "Алгоритм работает за время O(n), где n - длина строки s.";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
