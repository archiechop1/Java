package com.company;

public class CarMainPolymorphism {
    public static void main(String[] args) {
        CarPolymorphism[] arrayspecifications =
                new CarPolymorphism[]{new CarBrand(), new CarModel(), new CarBody(),
                        new CarGearBoxPoly(), new CarEnginesType(),new CarFuelTankCapacity(), new CarDrive()};
        for(int i=0; i< arrayspecifications.length; i++){
            arrayspecifications[i].show();
        }
    }
}
