package com.company;

public class Mathematics {
    public static void main(String[] args) {
        float num = 5.7f;
        System.out.println("Round " + Math.round(num));

        float num2 = 5.1f;
        System.out.println("Ceil " + Math.ceil(num2));

        float num3 = 5.999f;
        System.out.println("Floor " + Math.floor(num3));

        int num4, num5;
        num4 = 5;
        num5 = 10;

        System.out.println("Max " + Math.max(num4, num5));
        System.out.println("Min " + Math.min(num4, num5));

        int num6 = 3;
        System.out.println("Pow " + Math.pow(num6, 3));

        int num7 = 16;
        System.out.println("Sqrt " + Math.sqrt(num7));

        //Math.random [0,1) * 1000 = [0,1000)
        int num8 = (int) Math.round(Math.random() * 1000);
        System.out.println("Random is " + num8);
    }
}
