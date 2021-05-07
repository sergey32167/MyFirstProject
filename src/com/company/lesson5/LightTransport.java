package com.company.lesson5;

import com.company.lesson5.LandTransport;

import java.util.Scanner;

public class LightTransport extends LandTransport {


    public String body;
    public int people;
    public double way;
    double time;

    public LightTransport(String body, int people, String brand, int power, int maxSpeed, int mass, int wheel, double fuel) {
        this.body = body;
        this.people = people;
        this.brand = brand;
        this.power = power;
        this.mass = mass;
        this.maxspeed = maxSpeed;
        this.wheel = wheel;
        this.fuel = fuel;
    }


    public void info() {
        System.out.println("Марка" + " " + brand + " " + "Масса авто" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Количество колес" + " " + wheel + " " + "Расход топлива" +
                " " + fuel + " " + "Количество пассажиров" + " " + people + " " + "Тип кузова" + " " + body + "мощность в Кв"+ horse());
    }

    public void auto() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите время поездки");
        time = scan.nextDouble();
        way = time * maxspeed;
        double consum = consums();

        System.out.println("За" + " " + time + " " + "ч" + " " + "автомобиль" + " " + brand + " " + " двигаясь с максимальной" +
                "скоростью" + " " + maxspeed + " " + "км/ч" + " " + "проедет" + " " + way + " " + "км" + " " + "и израсходует" +
                consum + " " + "литров топлива.");
    }

    private double consums() {

        return way / 100 * fuel;

    }
}
