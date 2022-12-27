package com.company;

public class FinalStatic {
    public static void main(String[] args) {
        int x = FinalStaticDemo.a;
//        int y = FinalStaticDemo.b;
        FinalStaticDemo object = new FinalStaticDemo();
//        int y = object.b;
        object.a=15;
        System.out.println(object.a);
        System.out.println(FinalStaticDemo.a);
        int a = FinalStaticDemo.Do(15);
        System.out.println(a);
        int b = object.Doo(20);
        System.out.println(b);
    }
}
