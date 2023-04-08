package com.shohruh;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] values = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            values[i] = Integer.parseInt(args[i]);
        }

        int[] sortedValues = sortAndPrint(values);

        for (int value : sortedValues) {
            System.out.println(value);
        }
    }

    public static int[] sortAndPrint(int[] values) {
        Arrays.sort(values);
        return values;
    }
}