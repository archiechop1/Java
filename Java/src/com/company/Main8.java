package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        switch (num){
            case 10:
                System.out.println("num=10");
                break;
            case 20:
                System.out.println("num=20");
                break;
            case 100:
                System.out.println("num=100");
                break;
            default:
                System.out.println("Num is some number");
    }

    }
}
