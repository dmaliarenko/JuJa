package com.juja.woland;

import java.util.Arrays;

/**
 * Created by woland on 11/24/15.
 */
public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] result = {};
        int max = 0;

        int i = 0;
        while (i < array.length) {

            int counter = 0;
            int j = i;
            while ( j < array.length && array[j] > 0 ) {
                counter++;
                j++;
            }

            if (counter != 0 && counter >= max) {
                max = counter;
                result = new int [2];
                result[0] = i;
                result[1] = j - 1;
                i = j;
            }

            i++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0,-1,0,-1};
        lookFor(array);
    }
}
