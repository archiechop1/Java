package com.company;

public class CountryResolve implements CountryInterface{
    String country;

    CountryResolve(String country){
        this.country=country;
    }

    @Override
    public void getCapital(String city) {
        System.out.println("The capital of "+ country+" is "+city);
    }
}
