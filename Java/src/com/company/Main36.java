package com.company;

public class Main36 {
    public static void main(String[] args) {
        try{
            int x = 100/0;
            int [] arr = {10,20,30};
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println("Some error "+e);
        } finally {
            System.out.println("Hello");
        }
    }
}
