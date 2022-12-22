package com.company;

public class Car {
    public static void main(String[] args) {
        CarGearBox some = new CarGearBox("Audi", "A6", "Black", 20000, "Diesel", "Automatic");
        System.out.println(some.brand+ " " + some.model+ " "+ some.color+ " "+some.price+" "+some.typeoffuel+" "+some.typeofgearbox);
    }
}
