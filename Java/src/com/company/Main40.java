package com.company;

public class Main40 {
    public static void main(String[] args) {
        int[] numbers = {20, 10, 25, 40, 30, 60, 5, 80};
        System.out.println("Max value from array is " +getMax(numbers));
        System.out.println("Min value from array is " +getMin(numbers));
    }
    public static int getMax(int [] array){
        int max;
        max=array[0];
        for (int i =0; i<array.length; i++){
            if (max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int [] array){
        int min;
        min=array[0];
        for (int i =0; i<array.length; i++){
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
