package com.company;

public class Main14 {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 1;
        num2 = 2;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i<10; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            System.out.print(result + " ");

        }
    }
}
