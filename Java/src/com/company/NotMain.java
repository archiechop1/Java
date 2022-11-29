package com.company;

import java.util.Scanner;

public class NotMain {
    public static void main(String[] args) {
        int number;
        Scanner scn= new Scanner(System.in);
        System.out.print("Please write a number from 1 to 10: ");
        number = scn.nextInt();
        do {
            System.out.print(number + " ");
        }
        while (number<= 1 || number>=10);
        }
//        int num = 10;
//        do {
//            System.out.println(num);
//            num+=2;
//        }
//        while (num<=50);
//    }

    }
