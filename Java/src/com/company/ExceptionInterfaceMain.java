package com.company;



public class ExceptionInterfaceMain {
    public static void main(String[] args){
        ExceptionInterface object1 = new ExceptionInterfaceResolve() ;
        try {
            System.out.println(object1.math(10,0));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
