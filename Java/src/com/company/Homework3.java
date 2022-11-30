package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] another = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            another[numbers.length - 1 - i] = numbers[i];
        }
        numbers = another;
        for (int i : numbers) {

            System.out.print(" " +i);
        }
    }
}
