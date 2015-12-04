package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/26/15.
 */

public class Lab16_InsertionSorter_optima_test {

    static int binarySearch(int[] arr, int low, int high, int x) {

        while (low <= high) {

            int mid = (low + high) / 2;
            int midVal = arr[mid];

            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        System.out.println("low: " + low);
        System.out.println("high: " + high);

        return -low-1;
    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];

            int newPosition = Math.abs(binarySearch(arr, 0, k-1, newElement) + 1);
            int Position = Math.abs(Arrays.binarySearch(arr, 0, k, newElement) + 1);

            System.out.println("newPosition: " + newPosition);
            System.out.println("Position: " + Position);

            //System.arraycopy(arr, newPosition, arr, newPosition + 1, k - newPosition);

            arr[newPosition] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,9,1,3,7,6,4};
        sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] arrb = {1, 3, 5, 7, 9, 11};
        //binarySearch(arrb, 0, 5, 2);
        System.out.println("binarySearch: " + binarySearch(arrb, 0, 5, 2));
    }
}
