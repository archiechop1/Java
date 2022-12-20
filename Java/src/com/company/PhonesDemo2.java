package com.company;

public class PhonesDemo2 {
    public int price;
    public String model;
    public int memory;
    public String color;

    PhonesDemo2(){

    }
    PhonesDemo2( String model, int price,  int memory, String color){

        this.price=price;
        this.model=model;
        this.memory=memory;
        this.color=color;

    }
    PhonesDemo2(String model){
        this.model=model;
    }
}
