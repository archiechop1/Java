package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Please enter some value: ");
        a = scn.nextInt();


        if(a==10){
            System.out.println("a is 10 or 100");
        }else{
            System.out.println("a is not 10 or 100");
        }
    }
}
