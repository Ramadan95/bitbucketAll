package com.student.javacourse.module01.lesson3;

import java.util.Arrays;

public class HasDuplicate {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5,6};
        System.out.println(hasDuplicate(arr));
    }

    static boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return true;
        }
        return false;
    }
}
