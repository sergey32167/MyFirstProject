package com.company;

import com.company.lesson5.CivilTransport;
import com.company.lesson5.MilitaryTransport;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        CivilTransport transport = new CivilTransport(10, true, "sfdsf",11,11,11,11,11);
        transport.info();
        transport.man();
        transport.check();

    }
}
