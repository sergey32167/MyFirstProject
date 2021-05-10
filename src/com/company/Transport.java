package com.company;

import java.util.Scanner;

public class Transport {

    public int power;
    public int maxspeed;
    public int mass;
    public String brand;

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void horse() {


        double a;
        a = power * 0.74;
        System.out.println(a + "Кв");

    }

}
