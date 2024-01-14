package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int change = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (change >= coins[index]) {
                change -= coins[index];
                result[size] = coins[index];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
