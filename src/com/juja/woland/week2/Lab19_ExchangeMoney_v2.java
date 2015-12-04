package com.juja.woland.week2;

import java.util.Arrays;

/**
 * Created by woland on 11/28/15.
 */
public class Lab19_ExchangeMoney_v2 {

    private static int exchange(int[] nominal, int amount, int n) {

        if (amount == 0) {
            return 1;
        } else if (amount < 0 || n == 0) {
            return 0;
        } else {
            return exchange(nominal, amount, n - 1) + exchange(nominal, amount - nominal[n - 1], n);
        }

    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int[] nominal = {1,2,5,10,25,50};
        if (amountForExchange < nominal[0]) {
            return 0;
        } else {
            return exchange(nominal, amountForExchange, nominal.length);
        }
    }

    public static void main(String[] args) {
        int amount = 100;
        System.out.println(exchangeAmountOfCoinsBrutForce(amount));
    }
}
