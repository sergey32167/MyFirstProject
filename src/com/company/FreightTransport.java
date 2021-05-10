package com.company;

import java.util.Scanner;

public class FreightTransport extends LandTransport {

     public double cargo;

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public void info () {
        System.out.println("Марка" + " " + brand + " " + "Масса авто" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Количество колес" + " " + wheel + " " + "Расход топлива" +
                " " + fuel + " " + "Грузоподъемность" + " " + cargo );
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
