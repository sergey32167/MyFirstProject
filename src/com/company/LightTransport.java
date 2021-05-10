package com.company;

import java.util.Scanner;

public class LightTransport extends LandTransport {

    public String body;
    public int people;

    public void setBody(String body) {
        this.body = body;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void info() {
        System.out.println("Марка" + " " + brand + " " + "Масса авто" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Количество колес" + " " + wheel + " " + "Расход топлива" +
                " " + fuel + " " + "Количество пассажиров" + " " + people + " " + "Тип кузова" + " " + body);
    }

    private void avto() {

        System.out.println("Введите время поездки");

        Scanner scan = new Scanner(System.in);

        double time = scan.nextDouble();
        double consum;
        double way;

        way = time * maxspeed;
        consum = (way / 100) * fuel;

        System.out.println("За" + " " + time + " " + "ч" + " " + "автомобиль" + " " + brand + " " + " двигаясь с максимальной" +
                "скоростью" + " " + maxspeed + " " + "км/ч" + " " + "проедет" + " " + way + " " + "км" + " " + "и израсходует" +
                 consum + " " + "литров топлива.");

    }
}
