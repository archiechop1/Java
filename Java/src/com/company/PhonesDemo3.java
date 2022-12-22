package com.company;

public class PhonesDemo3 extends PhonesDemo2{
    public String systems;
    public String cpu;

    PhonesDemo3(){

    }
    PhonesDemo3(String systems, String cpu){
        this.systems = systems;
        this.cpu=cpu;
    }

    PhonesDemo3(String model, int price, String color, String systems, String cpu){
//super(model,price,color);
        this.systems = systems;
        this.cpu=cpu;
        super.model = model;
        super.price=price;
        super.color=color;
    }

}
