package com.company;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Please enter a month: ");
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();

        if (month > 0 && month < 13) {
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Try again!");

            for (int i = 0; i < months.length; i++) {
                if (month == i + 1) {
                    System.out.println(months[i]);
                }
            }

        }
    }
}
