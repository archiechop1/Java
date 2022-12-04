package com.company;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[] numbers = {20, 10, 25, 40, 30, 60};
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        int min = numbers[0];
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
