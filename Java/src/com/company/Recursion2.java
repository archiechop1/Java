package com.company;

public class Recursion2 {
    public static void main(String[] args) {
        rec1(10, 0);
    }
    public static void rec1(int num, int num2){
        int param = num;
        rec2(param, num2);

    }
    public static void rec2(int num, int num2){
        if (num>0){
            num--;
            num2+=2;
            rec1(num, num2);
        }else {
            System.out.println(num2);
        }
    }
}
