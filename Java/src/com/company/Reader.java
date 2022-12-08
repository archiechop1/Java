package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some letter: ");
        char letter = scn.next().toLowerCase().charAt(0);
        char letterUp = Character.toUpperCase(letter);

        String[] array;
        try{
            file = new BufferedReader(new FileReader("src/com/company/test.txt"));
            String line;
            int countLetter;
            int countWords;
            while ((line=file.readLine()) !=null){
                countLetter = 0;
                countWords =0;
                array = line.split(" ");
                for(int i=0; i< array.length; i++){
                    array[i] = Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
                }
                System.out.println(Arrays.toString(array));
                line.toLowerCase();
                for (int i=0; i<line.length(); i++){
                    if (line.charAt(i) == letter || line.charAt(i) == letterUp){
                        countLetter++;
                    }
                }

                for (String element : array){
                    countWords++;
                }


                System.out.println("Letter " + letter+ " seems "+countLetter+ " time(s)");
                System.out.println("Total words: "+countWords);
            }
        }catch(Exception e){
            System.out.println("Some error "+e);

        }
    }
}
