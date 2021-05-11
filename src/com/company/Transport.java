package com.company;

import java.util.Scanner;

public abstract class Transport {

    protected int power;
    protected int maxspeed;
    protected int mass;
    protected String brand;
    double a;

    protected double horse() {
        return power * 0.74;
    }


    public abstract void info();

}
