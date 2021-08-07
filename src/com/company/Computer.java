package com.company;

import java.util.Scanner;

public class Computer {

    private Scanner scan; 
    private String processor;
    private int ram;
    private int rom;
    private int limit;
    private int countMax;


    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Computer() {
        this.scan = new Scanner(System.in);
        this.countMax = 0;
        this.limit = (int) (2 + Math.random() * 4);
    }

    public void print() {
        System.out.println(ram + " " + rom + " " + processor + " ");
    }

    public void turnOn() {
        while (countMax <= limit) {
            System.out.println("Введите пароль");

            int a = scan.nextInt();
            int b = (int) (Math.random() * 2);

            if (a == b) {
                System.out.println("Комрьютер включен");
                break;
            } else {
                System.out.println("Попробуйте еще");
            }
            countMax++;
        }
        limited();
    }

    public void turnOff() {

        while (countMax <= limit) {
            System.out.println("Введите пароль");

            int a = scan.nextInt();
            int b = (int) (Math.random() * 2);

            if (a == b) {
                System.out.println("Комрьютер выключен");
                break;
            } else {
                System.out.println("Попробуйте еще");
            }
            countMax++;
        }
        limited();

    }

    public void limited() {

        if (countMax > limit) {
            System.out.println("Компьютер сгорел");
            throw new RuntimeException();
        }

    }

}
