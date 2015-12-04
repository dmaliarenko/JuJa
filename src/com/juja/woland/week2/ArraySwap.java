package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/25/15.
 */
public class ArraySwap {

    public static void swap(int[] data, int k, int l) {
        int buffer = data[k];
        data[k] = data[l];
        data[l] = buffer;
    }

    public static void fun(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] < data[k + 1]) {
                swap(data, k, k + 1);
            }
        }
    }
    public static void main(String[] args) {
        int[] myarray = {1,2,3,4};

        fun(myarray);
        System.out.println(Arrays.toString(myarray));

    }

}
