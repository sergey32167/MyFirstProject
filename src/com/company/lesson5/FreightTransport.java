package com.company.lesson5;

import java.util.Scanner;

public class FreightTransport extends LandTransport {

     public double cargo;

    public FreightTransport(double cargo, String brand, int power, int maxSpeed, int mass, int wheel, double fuel) {
        this.cargo = cargo;
        this.brand = brand;
        this.power = power;
        this.mass = mass;
        this.maxspeed = maxSpeed;
        this.wheel = wheel;
        this.fuel = fuel;
    }


    public void info () {
        System.out.println("Марка" + " " + brand + " " + "Масса авто" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Количество колес" + " " + wheel + " " + "Расход топлива" +
                " " + fuel + " " + "Грузоподъемность" + " " + cargo + "мощность в Кв"+ horse() );
    }

    public void lifting () {

        System.out.println("Введите вес груза");

        Scanner scan = new Scanner(System.in);

        double weight = scan.nextDouble();

        if ( weight > cargo){
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }
}
