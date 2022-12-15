package com.company;

import java.util.Scanner;

public class WhichSignIsYours {
    public static void main(String[] args) {
        month();
    }

    public static int month(){
        String[]months = new String [] {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Please write a month of birth: ");
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        int result = month;
        return result;
    }
}

