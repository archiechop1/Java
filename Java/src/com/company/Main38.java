package com.company;

public class Main38 {
    public static void main(String[] args) {
        function();
        function2(5, 10);
        int result = function3(15,20);
        System.out.println(result);
    }

    public static void function() {
        int num1, num2, result;
        num1 = 10;
        num2 = 20;
        result = num1 + num2;
        System.out.println(result);
    }

    public static void function2(int num1, int num2) {
        int result;
        result = num1 + num2;
        System.out.println(result);
    }

    public static int function3(int num1, int num2) {
        int result;
        result=num1+num2;
        return result;
    }

}
