package com.company;

public class Main24 {
    public static void main(String[] args) {
        int num =9;
        int range = 1;
        int result =1;

        while(true){
            result = num*result;
            System.out.println(num + "**" + range +" = "+ result);
            range++;
            if (range>3){
                break;

            }
        }
    }
}
