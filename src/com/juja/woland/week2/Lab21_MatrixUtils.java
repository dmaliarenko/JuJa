package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/30/15.
 */
public class Lab21_MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        int[][] mul = new int[fst.length][snd[0].length];
        int tmp = 0;

        for (int i = 0; i < fst.length; i++) {
            for (int j = 0; j < snd[0].length; j++) {
                for (int p = 0; p < fst[0].length; p++) {
                    tmp  += fst[i][p] * snd[p][j];
                }
                mul[i][j] = tmp;
                tmp = 0;
            }

        }
        return mul;
    }

    public static void main(String[] args) {
        int[][] fst = {
                {1,2},
                {7,8},
                {3,4}
        };
        int[][] snd = {
                {3,4,5,6},
                {9,0,1,2}
        };

        System.out.println(Arrays.deepToString(mul(fst, snd)));
    }

}
