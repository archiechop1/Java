package com.company;

public class AnimalsDemo {
    public String breed;
    public int age;
    public String coatColor;

    public String voice = "meow";

    public void say (String voice){
        System.out.println("Say "+voice);
    }
    AnimalsDemo(){

    }
    AnimalsDemo(String b, int a, String c){
        breed = b;
        age=a;
        coatColor = c;

    }
}
