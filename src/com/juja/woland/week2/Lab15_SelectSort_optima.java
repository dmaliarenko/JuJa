package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/26/15.
 */

public class Lab15_SelectSort_optima {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = barrier;
            int minValue = arr[min];

            for (int index = barrier + 1; index < arr.length; index++) {
                if (minValue > arr[index]) {
                    min = index;
                    minValue = arr[min];
                }
            }

            int tmp = arr[min];
            arr[min] = arr[barrier];
            arr[barrier] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
