package com.company;

public class CarEngine extends CarDemo {
    String typeoffuel;

    CarEngine(){

    }
    CarEngine(String brand, String model, String color, int price, String typeoffuel){
        super(brand,model, color, price);
        this.typeoffuel=typeoffuel;
    }
}
