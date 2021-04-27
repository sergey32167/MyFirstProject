package com.company;

import java.util.Scanner;

public class lesson2 {

    public static void task1() {
        // из двоичной в десятичную
        // ooo = 0
        // 1010 = 10
        // 1 =1
        //1000 = 8
        // 110011 = 51
        // 1111111 = 127
        // 11111111 = 255
        // из десятичной в двоичную
        // 44 = 101100
        // 777 = 1100001001
        // 2342 = 100100100110
        //655 = 1010001111
        //52 = 110100
        // 5 = 101
        // 22222 = 101011011001110
    }

    public static void task2() {
        int i = 2234;
        int a = i % 10;
        i=i/10;
        int b = i % 10;
        i=i/10;
        int c = i % 10;
        i=i/10;
        int d = i % 10 ;
        if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
        System.out.println("True");
            } else {
        System.out.println("False");
        }
            }
    public static void task3() {
    int a = 76;
    if (a % 2 ==0) {
        System.out.println("Число четное");
        }
    else {
        System.out.println( "Число нечетное");
        }
    if (a % 10 == 7) {
        System.out.println("Заканчивается на 7");
        }
    else {
        System.out.println("Не заканчивается на 7");
    }
    }
    public static void task4() {
    int a = 7;
    int b = 2;
    int c = 3;
    if (a > b+c){
        System.out.println("Треугольник cуществует");
            }  else if (b > a+c){
        System.out.println("Треугольник cуществует");
            } else if (c > a+b){
        System.out.println("Треугольник cуществует");
            }  else {
        System.out.println("Треугольник не cуществует");
            }
    }

    public static void task5() {
        int a = -6;
        if (a>0){
            System.out.println(a+=1);
        } else if (a<0){
            System.out.println(a-=2);
        } else {
            System.out.println(a=10);
        }
    }

    public static void task6() {
        int a = 27;
        int b = 22;
        int result = a > b ? a:b;
        if (a>b){
            result = a;
        } else { result = b;
            }
        System.out.println(result);
    }

    public static void task7() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a % 10;
        switch (b){
            case  1:
            System.out.println(a + " программист");
            break;
            case  2:
            System.out.println(a + " программиста");
            break;
            case  3:
            System.out.println(a + " программиста");
            break;
            case  4:
            System.out.println(a + "программиста");
            break;
            default:
            System.out.println(a + "программистов");
        }
    }
}
