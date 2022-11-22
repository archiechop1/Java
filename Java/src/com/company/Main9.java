package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        int num, num2, result;
        char sym;
        Scanner scn = new Scanner (System.in);
        System.out.println("Please enter first number: ");
        num = scn.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scn.nextInt();
        System.out.println("Please enter an operation(+,-, /, *): ");
        sym = scn.next().charAt(0);
        while (true){
            if (sym !='+' && sym !='-' && sym !='*' && sym !='/') {
                System.out.println("Incorrect operation, please enter an operation again: ");
                sym = scn.next().charAt(0);
            }else{

                switch (sym) {
                    case '+':
                        result = num + num2;
                        System.out.println(result);
                        break;
                    case '-':
                        result = num - num2;
                        System.out.println(result);
                        break;
                    case '*':
                        result = num * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        result = num / num2;
                        System.out.println(result);
                        break;


                }
                break;
            }
        }
    }
}
