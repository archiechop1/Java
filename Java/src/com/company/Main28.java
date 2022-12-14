package com.company;

import java.util.Arrays;

public class Main28 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 6, 8, 10, 10, -10,-10,-5};
        Arrays.sort(array);
        int someValue = array[0];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (someValue < array[i]) {
                someValue = array[i];
                count++;

            }
        }
        System.out.println(Arrays.toString(array));
        int index = 1;
        int[] array2 = new int[count];
        array2[0] = array[0];
        count = array[0];
        for (int i = 0; i < array.length; i++) {
            if (count<array[i]){
                count = array[i];
                array2[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
