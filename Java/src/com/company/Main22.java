package com.company;

import java.util.Arrays;

public class Main22 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 5, 6, 7, 8, 9, 10, 7, 30};
        int num = 7;
        int num2 = 3;
        for (int i = 0; i < array.length; i++) {
        if (array[i] == num || array[i] == num2){
            array[i] = array[i]*2;
        }
        }
        System.out.println(Arrays.toString(array));
    }
}
