package com.company;

public class TV implements RemoteControl{
    String model;
    TV(){

    }
    TV(String model){
        this.model = model;
    }

    @Override
    public void turnon() {
        System.out.println("This is "+model+"! It's turning on!");
    }

    @Override
    public void makelouder() {
        System.out.println("The volume is made louder!");
    }
}
