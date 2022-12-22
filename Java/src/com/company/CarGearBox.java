package com.company;

public class CarGearBox extends CarEngine{
    String typeofgearbox;

    CarGearBox(){

    }
    CarGearBox(String brand, String model, String color, int price, String typeoffuel, String typeofgearbox){
        super(brand,model,color,price, typeoffuel);
        this.typeofgearbox=typeofgearbox;
    }
}
