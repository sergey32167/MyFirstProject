package com.company.lesson5;

import com.company.lesson5.AirTransport;

public class MilitaryTransport extends AirTransport {

    private int rocket;
    private boolean catapult;

    public MilitaryTransport(int rocket, boolean catapult, String brand, int power, int maxSpeed, int mass, int band, int wings) {
        this.rocket = rocket;
        this.catapult = catapult;
        this.brand = brand;
        this.power = power;
        this.mass = mass;
        this.maxspeed = maxSpeed;
        this.band = band;
        this.wings = wings;
    }


    public void info () {

        System.out.println("Марка" + " " + brand + " " + "Масса борта" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Размер крыльев" + " " + wings + " " + "Длинна полосы" +
                " " + band + " " + "Количество ракет" + " " + rocket + "мощность в Кв"+ horse());
    }

    public void charge () {
        if (rocket != 0){
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void check () {

        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет системы катапультирования");
        }
    }
}
