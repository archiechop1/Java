package com.company;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5}; //new int[] can be not written
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        float[] arrays = new float[]{6.5f,7.4f,8.9f,9.7f,10.5f};
        System.out.println(Arrays.toString(arrays));
        System.out.println(arrays[3]);
        int[][]array2 = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(array2[2][1]);

        int [] array3 = new int[4];
        array3[0]=1;
        array3[1]=2;
        array3[2]=5;
        array3[3]=10;
        System.out.println(Arrays.toString(array3));

        String [] cars = new String[4];
        cars[0]="Mazda";
        cars[1]="BMW";
        cars[2]="Skoda";
        cars[3]="Toyota";
        System.out.println(Arrays.toString(cars));


    }
}
