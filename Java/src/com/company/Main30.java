package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main30 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum =0;
        for (int i =0; i< array.length; i++){
            sum+=array[i];


        }
        System.out.println(sum);

        int i = 0;
        int sum2=0;
        while (true){
            sum2+=array[i];
            i++;
            if (i== array.length){
                break;
            }
        }
        System.out.println(sum2);

        int sum3=0;
        for (int num: array){
            sum3+=num;
        }
        System.out.println(sum3);

        IntStream elements = IntStream.of(array);
        int sum4 = elements.sum();

        System.out.println(sum4);

        System.out.println(Arrays.stream(array).sum());

    }
}