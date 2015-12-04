package com.juja.woland;

/**
 * Created by woland on 11/24/15.
 */
public class MathUtils {
    public static int lookFor(int max) {
        int counter = 0;
        String solution = "";

        for (int i = 1; i <= (int) Math.sqrt(max - 1); i++) {
            for (int j = 1; j <= (int) Math.sqrt(max - 1); j++) {
                if ((i*i + j*j) <= max) {
                    counter++;
                    solution += "{a=" + i + ",b=" + j + "}";
                }
            }
        }
        System.out.println("Solution: " + solution);
        return counter;
    }

    public static void main(String[] args) {
        int max = 14;
//        lookFor(max);
        System.out.println("number of solution: " + lookFor(max));
    }
}
