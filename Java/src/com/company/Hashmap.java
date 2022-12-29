package com.company;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String, String>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Latvia", "Riga");
        capitals.put("Lithuania", "Vilnius");
        System.out.println(capitals);

        System.out.println(capitals.get("Estonia"));
        for (String i : capitals.values()){
            System.out.println(i);
    }
        for (String i : capitals.keySet()){
            System.out.println(i);
        }
//        capitals.remove("Latvia");
//        capitals.clear();

        HashMap<String, Integer> namesage = new HashMap<String, Integer>();
        namesage.put("Bob", 40);
        namesage.put("John", 50);
        namesage.put("Lee", 96);
        namesage.put("Mark", 30);
        namesage.put("Matt", 10);

        int sum = 0;
        for (int i : namesage.values()){
            sum+=i;
        }
        float averageage = sum/namesage.size();
        System.out.println("Average age is "+averageage);
    }
}

