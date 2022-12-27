package com.company;

public class CarNestedDemo {
    public String mark;
    public String model;

    CarNestedDemo(String mark, String model){
        this.mark=mark;
        this.model=model;
    }

}

class window{
    public static void print(){
        System.out.println("This is a window!");
    }
 }

 class wheels{
    int R;

 } //вложенные классы (в одном файле несколько классов), бывают статические и внутрениие классы

 class door{
    class window{ //внутренний класс

    }
 }
