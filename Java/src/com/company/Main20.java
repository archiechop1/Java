package com.company;

public class Main20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 2 && i< array.length-3 && i!=4)  {
                result += array[i];
            }
        }
        System.out.println(result);
    }
}
