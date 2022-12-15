package com.company;

import java.util.Arrays;

public class Main44 {
    public static void main(String[] args) {
        int[]array = new int[]{2,1,1,4,5,4,-1,3,3};
        Arrays.sort(array);

        int n= removeDouble(array, array.length);

        for (int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }

    }
    public static int removeDouble(int a[], int n){
        if (n==0 || n==1){
            return n;
        }
        int [] temp =new int[n];
        int j =0;

        for (int i=0; i<n-1; i++){
            if (a[i] !=a[i+1]){
                temp[j] = a[i];
                j++;
            }
        }
        temp[j]=a[n-1];
        j++;

        for (int i=0; i<j; i++){
            a[i] = temp[i];
        }
        return j;
    }
}
