package com.company;

public class Main46 {
    public static void main(String[] args) {
        enum levels{
            Low,
            Medium,
            Hard
        }
        levels var = levels.Low;
        switch (var){
            case Low:
                System.out.println("Level is low");
                break;
            case Medium:
                System.out.println("Level is medium");
                break;
            case Hard:
                System.out.println("Level is hard");
                break;
        }
    }
}
