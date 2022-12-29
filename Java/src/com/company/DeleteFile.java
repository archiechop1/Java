package com.company;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
            File file = new File("src/com/company/test.txt");
            if(file.delete()){
            System.out.println("File with name "+file.getName()+ " is deleted!");
        }else{
            System.out.println("Error");
        }
    }
}
