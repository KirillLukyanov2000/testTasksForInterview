package ru.lukyanov;

public class Test {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isFib(int num) {
        int a = 0, b = 0, c = 1;
        for (int i = 0; i <= num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }

    public static void changeTwoNum1(int a, int b) {
        int temp;
        temp = a;
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
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] !=max1) {
                max2 = arr[i];

            }
        }System.out.println(max1 + " " + max2);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        isFib(6);
        changeTwoNum1(1, 2);
        changeTwoNum2(1, 2);
        int[] arr = {3, 2, 5, 1, 4, 8, 20, -10};
        findSecElem(arr);
    }
}
