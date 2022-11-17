package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        a = scn.nextInt();
        if(a>=5 && a<=10){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
