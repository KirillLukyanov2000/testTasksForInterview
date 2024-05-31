package ru.lukyanov;

public class Test {

    public static void isPrime(int number) {

    }
    public static void isArmstrong(int num) {

    }

    public static void isFib(int num) {

    }

    public static void changeTwoNum1(int a, int b) {

    }

    public static void changeTwoNum2(int a, int b) {

    }

    public static void findSecElem(int[] arr) {

    }

    public static void isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String string = stringBuilder.reverse().toString();
        System.out.println(str.equals(string));
    }

    public static void checkPalindr(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                System.out.println(false);
        }
    }

    public static void revArr (String str) {
        char[] charArray1 = str.toCharArray();
        for (int i = 0; i < charArray1.length/2; i++) {
            char temp = charArray1[i];
            charArray1[i] = charArray1[charArray1.length-1-i];
            charArray1[charArray1.length-1-i] = temp;
        }System.out.println(new String(charArray1));
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(10));
//        isFib(6);
//        changeTwoNum1(1, 2);
//        changeTwoNum2(1, 2);
//        int[] arr = {3, 2, 5, 1, 4, 8, 20, -10};
//        findSecElem(arr);
//        isArmstrong(371);
isPalindrome("TeneT");
revArr("TeneT");
checkPalindr("Tenet");
    }
}
