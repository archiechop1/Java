package com.company;

import java.util.Arrays;

public class Main42 {
    public static void main(String[] args) {
        int length = 1000;
        int [] prime = new int[length];
        int n = 0;
        for (int i=0; n<length; i++){
            if (checkprime(i)){
                prime[n] = i;
                n++;

            }
        }
        System.out.println(Arrays.toString(prime));
    }
    public static boolean checkprime(int num){
        if (num<2){
            return false;

        }
        for (int i=2; i<num; i++){
            if (num %i==0){
                return false;
            }
        }
        return true;
    }

}
