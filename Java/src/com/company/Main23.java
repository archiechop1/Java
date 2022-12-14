package com.company;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        int num1, num2, result;

        boolean isTrue2 = true;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("This is a game!");
        while (isTrue2) {
            boolean isTrue = true;
            System.out.println("Game rules: first number is random. Sum of 2 numbers must be lower than 100.");
            num1 = (int) Math.round(Math.random() * 100);
            System.out.println("Please enter a second number: ");
            num2 = scn.nextInt();
            while (isTrue) {
                if (num2 < 20) {
                    System.out.println("Second number must be bigger than 20!");
                    System.out.println("Please enter the second number again!");
                    num2 = scn.nextInt();
                } else {
                    result = num1 + num2;
                    if (result > 100) {
                        System.out.println("Game over!");
                        System.out.println("The sum of two numbers was " + result);
                    } else {
                        System.out.println("You won the game, because the sum of two numbers was " + result);
                    }
                    isTrue = false;
                }
            }
            System.out.println("Would you like to play again? (Yes/No)");
            String Yes_No = scn2.nextLine();
            while (true) {
                if (Yes_No.equals("Yes") || Yes_No.equals("No")) {
                    isTrue2 = Yes_No.equalsIgnoreCase("Yes");
                    break;
                } else {
                    System.out.println("Error! Type again Yes or No:");
                    Yes_No = scn2.nextLine();
                }
            }
        }
    }
}