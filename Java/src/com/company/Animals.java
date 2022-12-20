package com.company;

public class Animals {
    public static void main(String[] args) {
        AnimalsDemo cat = new AnimalsDemo("Sphinx", 4, "Brown");
        AnimalsDemo dog = new AnimalsDemo("Chihuahua", 5, "Red");



        System.out.println(cat.breed+ " " + cat.age+ " " + cat.coatColor);
        System.out.println(dog.breed+ " " + dog.age+ " " + dog.coatColor);


        cat.say("meow");
        dog.say("woof");
    }
}
