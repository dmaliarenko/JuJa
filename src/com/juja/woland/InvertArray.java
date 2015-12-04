package com.juja.woland;

import java.util.Arrays;

/**
 * Created by woland on 21.11.15.
 */

public class InvertArray {

    public static int [] myArray = {1,2,3,4,5};

    public static void invert(int[] arr) {

        for (int k = arr.length / 2; k > 0; k--) {
            int tmp = arr[arr.length - k];
            arr[arr.length - k] = arr[k - 1];
            arr[k - 1] = tmp;
        }

    }

    public static void main(String[] args) {
        invert(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}