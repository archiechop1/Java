package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);

        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2);

        LocalDateTime obj3 = LocalDateTime.now();
        System.out.println(obj3);

        DateTimeFormatter format_obj3 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String formatted_obj3 = obj3.format(format_obj3);
        System.out.println(formatted_obj3);
    }
}
