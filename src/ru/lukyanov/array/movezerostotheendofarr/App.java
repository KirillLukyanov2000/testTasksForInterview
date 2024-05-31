package ru.lukyanov.array.movezerostotheendofarr;

import java.util.Arrays;

public class App {
    public static int[] moveZeroesV1(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[count++] = num;
            }
        }
        while (count < nums.length) {
            nums[count++] = -1;
        }
        return nums;
    }

    public static int[] moveZeroesV2(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[count] = nums[i];
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 0, 12, 9};
        arr1 = moveZeroesV2(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0, 100, 0, 5};
        arr2 = moveZeroesV1(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
