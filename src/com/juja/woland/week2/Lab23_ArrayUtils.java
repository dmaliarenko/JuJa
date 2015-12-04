package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/30/15.
 */
public class Lab23_ArrayUtils {

    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0) {
            return null;
        } else {

            for (int i = 0; i < arg.length; i++) {
                if (arg[i] == null || arg[i].length == 0 || arg[i].length != arg.length) {
                    return null;
                }
            }

            int[][] newarr = new int[arg[0].length][arg.length];

            for (int i = 0; i < arg.length; i++) {
                for (int j = 0; j < arg[i].length; j++) {
                    newarr[j][arg.length - 1 -i] = arg[i][j];
                }
            }
            return newarr;
        }
    }

    public static void main(String[] args) {
        int[][] arg = {
                {1,2},
                {3,4}
        };

        System.out.println(Arrays.deepToString(rotateClockwise(arg)));
    }

}
