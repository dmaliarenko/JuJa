package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/30/15.
 */
public class Lab22_ArrayUtils_Cub {

    public static int[][][] rotateClockwise(int[][][] arg) {
        if (arg == null || arg.length == 0) {
            return null;
        } else {

            for (int i = 0; i < arg.length; i++) {
                if (arg[i] == null || arg[i].length == 0 || arg[i].length != arg.length) {
                    return null;
                }
            }
            for (int i = 0; i < arg.length; i++) {
                for (int j = 0; j < arg[i].length; j++) {
                    if (arg[i][j] == null || arg[i][j].length == 0 || arg[i][j].length != arg.length) {
                        return null;
                    }
                }
            }

            int[][][] newarr = new int[arg.length][arg.length][arg.length];

            for (int i = 0; i < arg.length; i++) {
                for (int j = 0; j < arg.length; j++) {
                    for (int z = 0; z < arg.length; z++) {
                        newarr[i][j][z] = arg[z][i][j];
                    }
                }
            }
            return newarr;
        }
    }

    public static void main(String[] args) {
        int[][][] arg = {
                {
                        {1,2},
                        {3,4}

                },
                {
                        {5,6},
                        {7,8}

                }
        };

        System.out.println(Arrays.deepToString(rotateClockwise(arg)));
    }

}
