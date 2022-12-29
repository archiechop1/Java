package com.company;

public class MainCountry {
    public static void main(String[] args) {
        CountryInterface country1 = new CountryResolve("Estonia");
        country1.getCapital("Tallinn");
    }
}
