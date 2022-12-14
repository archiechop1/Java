package com.company;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        celsius();
        fahrenheit();
        mile();
        kilometers();

    }

    public static float celsius() {
        float Fahrenheit, Celsius;
        System.out.println("Please enter a temperature in Fahrenheit: ");
        Scanner scn = new Scanner(System.in);
        Fahrenheit = scn.nextInt();
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        float result = Celsius;
        System.out.println("The temperature in Celsius is " + result + " °C");
        return result;
    }

    public static float fahrenheit() {
        float Fahrenheit, Celsius;
        System.out.println("Please enter a temperature in Celsius: ");
        Scanner scn = new Scanner(System.in);
        Celsius = scn.nextInt();
        Fahrenheit = (Celsius * 9 / 5) + 32;
        float result = Fahrenheit;
        System.out.println("The temperature in Fahrenheit is " + result + " °F");
        return result;
    }

    public static float mile() {
        float miles, km;
        System.out.println("Please enter a distance in miles: ");
        Scanner scn = new Scanner(System.in);
        miles = scn.nextInt();
        km = miles * 1.609f;
        float result = km;
        System.out.println("The distance in kilometers is " + result + " km.");
        return result;
    }

    public static float kilometers() {
        float miles, km;
        System.out.println("Please enter a distance in kilometers: ");
        Scanner scn = new Scanner(System.in);
        km = scn.nextInt();
        miles = km / 1.609f;
        float result = miles;
        System.out.println("The distance in miles is " + result + " miles.");
        return result;
    }
}

