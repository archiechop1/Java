package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] another = new int[numbers.length];
        int count=0;
        for (int i = numbers.length - 1; i > -1; i--) {
            another[count] = numbers[i];
            count++;

        }


//            another[numbers.length - 1 - i] = numbers[i];
//        }
//        numbers = another;
//        for (int i : numbers) {
//
//            System.out.print(" " +i);
//        }
            System.out.println(Arrays.toString(another));
        }
    }
