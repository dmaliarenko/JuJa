package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/26/15.
 */
public class Lab15_SelectSort {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
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
