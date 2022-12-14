package com.company;

import java.util.ArrayList;

public class Main30 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Toyota");

        System.out.println(cars.get(1));
        System.out.println(cars.size());
        cars.remove(2);
        System.out.println(cars.size());
        System.out.println(cars);
        cars.set(0, "BMW");
        cars.add("Lexus");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

    }
}
