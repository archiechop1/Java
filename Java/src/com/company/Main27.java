package com.company;

public class Main27 {
    public static void main(String[] args) {
        String  someString = "anchor";
        char someChar = 'a';
        int count =0;
        for (int i=0; i< someString.length(); i++){
            if (someString.charAt(i) == someChar){
                count++;

            }


        }
        System.out.println("In a word " + someString + ", letter " + someChar + " seems " +count+ " times.");
    }
}
