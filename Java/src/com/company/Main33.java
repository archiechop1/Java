package com.company;

import java.util.ArrayList;

public class Main33 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(7);

        for (int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
    }
}
