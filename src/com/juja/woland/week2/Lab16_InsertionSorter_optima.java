package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/26/15.
 */

public class Lab16_InsertionSorter_optima {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];

            int newPosition = Math.abs(Arrays.binarySearch(arr, 0, k, newElement) + 1);
            System.arraycopy(arr, newPosition, arr, newPosition + 1, k - newPosition);

            System.out.println("arr[" + k + "] = " + arr[k]);
            System.out.println("newPosition: " + newPosition);

            arr[newPosition] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,9,1,3,7,6,4};
        sort(arr);

        System.out.printf(Arrays.toString(arr));
    }
}
