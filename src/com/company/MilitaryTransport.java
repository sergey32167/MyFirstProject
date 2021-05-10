package com.company;

public class MilitaryTransport extends AirTransport {

    public int rocket = (int) (Math.random() * 6);
    public boolean catapult;


    public void info () {
        System.out.println("Марка" + " " + brand + " " + "Масса борта" + " " + mass + " " + "Максимальная скорость"
                + maxspeed + " " + "Мощность" + " " + power + " " + "Размер крыльев" + " " + wings + " " + "Длинна полосы" +
                " " + band + " " + "Количество ракет" + " " + rocket  );
    }

    public void charge () {
        if (rocket != 0){
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }

    public void check () {

        int w = (int)(Math.random()*2);

        if (w == 0) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }

    }
}
