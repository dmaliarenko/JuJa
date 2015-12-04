package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/25/15.
 */
//minimal drowning
public class Lab14_BubbleSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 1; index > barrier; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
