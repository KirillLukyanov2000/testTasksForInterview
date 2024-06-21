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

    public static void revStrV1(String str) {
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void revStrV2(String str) {
        String[] arr = str.split("");
        String[] arr2 = new String[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr2.length - 1 - i] = arr[i];
        }
        for (String s : arr2) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean isPalindrome = isPalindromeVar2("Tenet");
        System.out.println(isPalindrome);
        revStrV1("Учимся программировать");
        revStrV2("Учимся программировать");
    }

}
