package com.company;

import java.util.Scanner;

public class CivilTransport extends AirTransport {

    public int people;
    public boolean vip;

    public void setPeople(int people) {
        this.people = people;
    }

    public void info () {
        System.out.println("Марка" + " " + brand + " " + "Масса борта" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Размер крыльев" + " " + wings + " " + "Длинна полосы" +
                " " + band + " " + "Количество пасажиров" + " " + people );
    }

    public void man () {

        System.out.println("Введите количество людей");

        Scanner scan = new Scanner(System.in);

        int mans = scan.nextInt();

        if ( mans > people){
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет заполнен");
        }
    }

    public void check () {

        int w = (int)(Math.random()*2);

        if (w == 0) {
            System.out.println("Вип места имеются");
        } else {
            System.out.println("У вас нет вип мест");
        }

    }

}
