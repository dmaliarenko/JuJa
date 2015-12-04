package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/26/15.
 */
public class Lab16_InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0  && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        sort(arr);

        System.out.printf(Arrays.toString(arr));
    }
}
