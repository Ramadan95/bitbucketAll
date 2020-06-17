package com.student.javacourse.module01.lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrIndex(arr, 121)));
    }

    static int[] arrIndex(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) return new int[]{arr[i], arr[j]};
            }
        }
        return new int[]{0}; // if index not found method will returns [0]
    }
}
