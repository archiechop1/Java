package com.company;

import java.io.File;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        try{
            File file =  new File("src/com/company/test.txt");
            file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello world!");
            pw.print("Happy new year!");
            pw.print(" "+"2023");
            pw.close();
        }catch (Exception e){
            System.out.println("Some error "+e);
        }
    }
}
