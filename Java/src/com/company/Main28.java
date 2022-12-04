package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some words or sentences: ");
        String someString =scn.nextLine();
        System.out.println("Please write letter: ");
        String[] array = someString.split(" ");
        char someChar = scn.next().charAt(0);
        int count =0;
        int totalLetters = 0;
        int totalWords =0;

        for (int i=0; i< someString.length(); i++){
            if (someString.charAt(i) == someChar){
                count ++;
            }

            if (someString.charAt(i) != ' '){
                totalLetters++;
            }
//            if (someString.charAt(i) == ' '){
//                totalWords++;
//            }
        }
        for (String word : array){
            if (!word.equals("")){
                totalWords++;
            }
        }
        System.out.println("In a word/sentence " + someString + ", letter '" + someChar + "' seems " +count+ " time(s).");
        System.out.println("In a word/sentence total amount of letters " +totalLetters + "pc.");
        System.out.println("User wrote " +totalWords + "word(s).");
        System.out.println(Arrays.toString(array));
    }
}
