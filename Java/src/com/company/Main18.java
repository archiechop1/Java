package com.company;

public class Main18 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5, 347, 937};
        float result = 0;
        for (int i =0; i < numbers.length; i++){
            result += numbers[i];
        }
        float average = result/numbers.length;
        System.out.println("Result is " + result);
        System.out.println("Average is " + average);
    }
}
