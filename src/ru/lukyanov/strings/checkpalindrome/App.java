package ru.lukyanov.strings.checkpalindrome;

public class App {

    public static boolean isPalindromeVar1(String string) {
        string = string.toLowerCase();
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.reverse();
        return (builder.toString()).equals(string);
    }

    public static boolean isPalindromeVar2(String string) {
        string = string.toLowerCase();
        int length = string.length();
        int fromBeginning = 0;
        int fromEnd = length - 1;
        while (fromEnd > fromBeginning) {
            char forwardChar = string.charAt(fromBeginning++);
            char backwardChar = string.charAt(fromEnd--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPalindrome = isPalindromeVar2("Tenet");
        System.out.println(isPalindrome);
    }
}
