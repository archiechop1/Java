package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        sign();
    }

    public static void sign (){
        String [] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        String [] signs = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
                "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", };
        System.out.println("B-day month ");
        Scanner scn = new Scanner(System.in);
        String month = scn.nextLine();
        System.out.println("B-day day ");
        Scanner scn2 = new Scanner(System.in);
        int day = scn.nextInt();
        int numofmonth=0;
        if (Arrays.asList(months).contains(month)){
            numofmonth = Arrays.asList(months).indexOf(month);
            numofmonth++;

        }
        if (numofmonth<=2){
            if (day >= 1 && day <= 19){
                System.out.println("Your sign is "+ signs[numofmonth-1]);
            }else if (day>19 && day <=31){
                System.out.println("Your sign is "+ signs[numofmonth]);
            }
        }
            if (day >= 1 && day <= 19){
                System.out.println("Your sign is "+ signs[numofmonth-1]);
            }else if (day>19 && day <=31){
                System.out.println("Your sign is "+ signs[0]);
            }

        }
    }

