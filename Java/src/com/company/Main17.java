package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        String[] students;
        int length;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.print("Please enter a length of array: ");
        length = scn.nextInt();
        students = new String[length];

        for (int i =0; i<students.length; i++) {
            System.out.print("students[" + i + "] = ");
            students[i] = scn2.nextLine();
        }
        System.out.println(Arrays.toString(students));

    }
}
