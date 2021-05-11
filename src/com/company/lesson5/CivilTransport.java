package com.company.lesson5;

import com.company.lesson5.AirTransport;

import java.util.Scanner;

public class CivilTransport extends AirTransport {

    public int people;
    public boolean vip;


    public CivilTransport(int people, boolean vip, String brand, int power, int maxSpeed, int mass, int band, int wings) {
        this.people = people;
        this.vip = vip;
        this.brand = brand;
        this.power = power;
        this.mass = mass;
        this.maxspeed = maxSpeed;
        this.band = band;
        this.wings = wings;
    }


    public void info() {
        System.out.println("Марка" + " " + brand + " " + "Масса борта" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Размер крыльев" + " " + wings + " " + "Длинна полосы" +
                " " + band + " " + "Количество пасажиров" + " " + people + "мощность в Кв" + horse());
    }

    public void man() {

        System.out.println("Введите количество людей");

        Scanner scan = new Scanner(System.in);

        int mans = scan.nextInt();

        if (mans > people) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет заполнен");
        }
    }

    public void check() {

        if (vip) {
            System.out.println("Вип места имеются");
        } else {
            System.out.println("У вас нет вип мест");
        }


    }

}
