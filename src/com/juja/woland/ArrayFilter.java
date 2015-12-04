package com.juja.woland;

import java.util.Arrays;

/**
 * Created by woland on 22.11.15.
 */
public class ArrayFilter {
    public static int [] filterEven(int [] nums){
        int [] newnums = new int [nums.length];
        int j = 0;
        for (int i = 0; i <  nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("nums[i]: " + nums[i] +"; nums[i] % 2: " + nums[i] % 2) ;
                System.out.println("i: " +i +"; j: " + j) ;

                newnums[j] = nums[i];
                ++j;
            }
        }
        return newnums;
    }

    public static void main(String[] args) {
        int [] nums = {4,3,5,2,7};
        int [] result = ArrayFilter.filterEven(nums);

        System.out.println(Arrays.toString(result));
    }
}
