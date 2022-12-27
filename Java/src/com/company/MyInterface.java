package com.company;

public class MyInterface implements Print, Read {

    String mark;
    String model;

    MyInterface(){

    }
    MyInterface(String mark, String model){
        this.mark = mark;
        this.model=model;
    }

    @Override
    public void printCar(){
        System.out.println(mark+" "+model);
    }
    public void printBike(){
        System.out.println(mark+" "+model);
    }
    public void readCar(){
        System.out.println("BMW 530");
    }
    public void readBike(){
        System.out.println("Honda CRX");
    }
}
