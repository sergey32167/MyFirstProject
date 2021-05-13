package com.company;

public class Main {

       public static void main(String[] args)
    { System.out.println("Hello World");
        Computer comp = new Computer();
        comp.setRam(8);
        comp.setRom(500);
        comp.setPros("intel");
        comp.print();
        comp.turnOn();
        comp.turnOff();
    }
}
