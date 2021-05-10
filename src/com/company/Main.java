package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        LightTransport transport = new LightTransport();
        transport.setBrand("Audi");
        transport.setMass(1900);
        transport.setMaxspeed(250);
        transport.setPower(216);
        transport.setPeople(4);
        transport.setBody("купе");
        transport.setFuel(5.5);
        transport.setWheel(4);

    }
}
