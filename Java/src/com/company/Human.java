package com.company;

public class Human {
    public static void main(String[] args) {
        RemoteControl tw1 = new TV("Samsung");
        tw1.turnon();
        RemoteControl tw2 = new TV();
        tw2.makelouder();
    }
}
