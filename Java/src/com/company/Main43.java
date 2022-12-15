package com.company;

public class Main43 {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum());
        System.out.println(sum(5,10,15));
        System.out.println(sum(5f,6f));
    }
    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(){
        int a,b;
        a=10;
        b=15;
        int result = a+b;
        return result;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;

    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum (int a, float b){
        int a1=a;
        float b1=b;
        return a1;
        //if..else
    }

}
