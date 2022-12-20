package com.company;

public class Person {
    public static void main(String[] args) {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println(person1.hairColor);
        System.out.println(person1.height);
        person2.name ="John";
        System.out.println(person2.name);
        person1.say("John");
        person2.say("Bob");
    }
}
