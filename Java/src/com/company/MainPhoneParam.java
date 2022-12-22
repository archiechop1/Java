package com.company;

public class MainPhoneParam {
    class memory{
        String memory = "Switched off";

        public void working(){
            memory = "Memory is working";
            System.out.println(memory);
        }
        public void notworking(){
            memory="Memory is not working";
            System.out.println(memory);
        }
    }
    class cpu{
        String cpu;
        public void working(){
            cpu = "cpu is working";
            System.out.println(cpu);
        }
        public void notworking(){
            cpu = "cpu is not working";
            System.out.println(cpu);
        }
    }
    memory ram = new memory();
    cpu intel = new cpu();

}
