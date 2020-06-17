package com.student.javacourse.module01.lesson3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(arrDuplicate(arr));
    }

    static boolean arrDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}
