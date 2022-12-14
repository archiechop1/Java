package com.company;

import java.util.Arrays;

public class Main34 {
    public static void main(String[] args) {
        String[] a = {"K","O", "ZH", "Z", "G", "S", "F"};
        String temp;
        int length = a.length;
        for (int i = 0; i<length/2; i++){
            temp = a[length-i-1];
            a[length-i-1] = a[i];
            a[i] = temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
