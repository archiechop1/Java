package com.company;

import java.sql.SQLOutput;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo phone1 = new PhonesDemo();
        PhonesDemo phone2 = new PhonesDemo();
        PhonesDemo phone3 = new PhonesDemo("A406", 299, 32);
        PhonesDemo2 phone4 = new PhonesDemo2();
        PhonesDemo2 phone5 = new PhonesDemo2("X10", 499, 64, "White");
        PhonesDemo2 phone6 = new PhonesDemo2("5566");
        PhonesDemo3 phone7 = new PhonesDemo3();
        PhonesDemo3 phone8 = new PhonesDemo3("Android Kitkat", "Intel");
        PhonesDemo3 phone9 = new PhonesDemo3("X14", 250, "Brown", "Android", "Intel");
        phone7.cpu= "Intelcore";
        phone7.systems = "Android lollipop";

        phone4.model ="LG";
        phone4.price = 850;
        phone4.memory=128;
        phone4.color="Black";

        phone1.model ="Apple";
        phone1.price = 1000;
        phone1.memory=64;

        phone2.model ="Samsung";
        phone2.price = 800;
        phone2.memory=128;

        System.out.println(phone1.model+ " "+ phone1.price + " " + phone1.memory);
        System.out.println(phone2.model+ " "+ phone2.price + " " + phone2.memory);
        System.out.println(phone3.model+ " "+ phone3.price + " " + phone3.memory);
        System.out.println(phone4.model+ " "+ phone4.price + " " + phone4.memory+ " "+phone4.color);
        System.out.println(phone5.model+ " "+ phone5.price + " " + phone5.memory+ " "+phone5.color);
        System.out.println(phone7.systems+ " "+ phone7.cpu);
        System.out.println(phone9.model+ " "+ phone9.price+ " "+ phone9.color+ " "+ phone9.systems+ " "+ phone9.cpu);
    }
}
