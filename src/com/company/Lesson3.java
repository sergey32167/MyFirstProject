package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lesson3 {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void task1() {
        int[] array1 = new int[21];
        for (int i = 0; i < array1.length; i += 2) {
            array1[i] = i;
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 2; i < array1.length; i += 2) {
            array1[i] = i;
            System.out.println(array1[i]);
        }
    }

    public void task2() {

        int[] array2 = new int[100];
        for (int i = 1; i < array2.length; i += 2) {
            array2[i] = i;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 99; i > 0 && i < array2.length; i -= 2) {
            array2[i] = i;

            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

    public void task3() {

        int[] array3 = new int[15];
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = rand.nextInt(100);

            if (array3[i] % 2 != 0) {
                count++;
            }
            System.out.print(array3[i] + " ");
        }
        System.out.print("\n");
        System.out.println(count);
    }

    public void task4() {

        int[] array4 = new int[20];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = rand.nextInt(21);

            if (array4[i] % 2 == 0) {
                System.out.print("");
            } else {
                System.out.print(array4[i] = 0);

            }
            System.out.print(array4[i] + " ");
        }
        System.out.print("\n");
    }

    public void task5() {

        int[] array5 = new int[5];
        int total1 = 0;
        double q1 = 1;
        for (int i = 0; i < array5.length; i++) {
            array5[i] = rand.nextInt(16);
            System.out.print(array5[i] + " ");
            total1 = total1 + array5[i];
            q1 = total1 / 5.0;

        }
        System.out.println();
        System.out.print("Сумма" + q1);
        System.out.println();

        int[] array5a = new int[5];
        int total2 = 0;
        double q2 = 1;
        for (int j = 0; j < array5a.length; j++) {
            array5a[j] = rand.nextInt(16);
            System.out.print(array5a[j] + " ");
            total2 = total2 + array5a[j];
            q2 = total2 / 5.0;
        }
        System.out.println();
        System.out.print("Сумма" + q2);
        System.out.println();
        double result = q1 > q2 ? q1 : q2;
        if (q1 == q2) {
            System.out.print("Суммы равны");
        }
        System.out.print(result);
        System.out.println();
    }

    public void task6() {

        int[] array6 = new int[4];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = rand.nextInt(11);
            System.out.print(array6[i] + " ");
        }
        System.out.println();
        if (array6[0] < array6[1] && array6[1] < array6[2] && array6[2] < array6[3]) {
            System.out.print("Является строго возрастающей последовательностью");
        } else {
            System.out.print("Не является строго возрастающей последовательностью");
        }


        System.out.println();
    }

    public void task7() {

        int[] array7 = new int[12];
        int max = array7[0];
        int z = 0;
        for (int i = 0; i < array7.length; i++) {
            array7[i] = rand.nextInt(16);
            System.out.print(array7[i] + " ");
        }
        for (int i = 0; i < array7.length; i++) {
            if (array7[i] >= max) {
                max = array7[i];
                z = i;
            }
        }
        System.out.println();
        System.out.println(z);
        System.out.println("Наибольший элемент" + " " + max);
    }

    public void task8() {

    }

    public void task9() {

        System.out.println("Введите переменную");
        int n = scan.nextInt();
        if (n <= 3) {
            System.out.println("Неподхлдящее число");
            return;
        }

        int[] array9 = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            array9[i] = rand.nextInt(n);
            System.out.print(array9[i] + " ");
            if (array9[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println();

        int[] array9a = new int[j];
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (array9[i] % 2 == 0) {
                array9a[count1] = array9[i];
                System.out.print(array9a[count1] + " ");
                count1++;
            }
        }
        System.out.println();
//        System.out.println(Arrays.toString(array9a));
    }

    public void multitask1() {

        System.out.println("Введите переменные n,m");
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] multiarray1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiarray1[i][j] = rand.nextInt(50);
                System.out.print(multiarray1[i][j] + " ");
            }
            System.out.println();
        }
        int summ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    if (multiarray1[i][j] % 2 == 0) {
                        summ += multiarray1[i][j];
                    }
                }
            }
        }
        System.out.print(summ);
    }

    public void multitask2() {
        System.out.println("Введите переменные n,m");

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] multiarray2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiarray2[i][j] = rand.nextInt(50);
                System.out.print(multiarray2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (multiarray2[i][j] % 2 == 0) {
                    System.out.print("");
                } else {
                    System.out.print(multiarray2[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public void multitask3() {

        System.out.println("Введите переменные n,m");

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] multiarray3 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiarray3[i][j] = rand.nextInt(50);
                System.out.print(multiarray3[i][j] + " ");
            }
            System.out.println();
        }
        int product1 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    product1 *= multiarray3[i][j];
                }
            }
        }
        System.out.println("основная диагональ" + product1);

        int product2 = 1;
        for (int i = 0; i < n; i++) {
            int j = m - 1 - i;
            product2 *= multiarray3[i][j];
        }
        System.out.println("не основная диагональ" + product2);

        int result = product1 > product2 ? product1 : product2;
        System.out.println(result);
    }

    public void multitask4() {

        System.out.println("Введите переменные n,m");
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] multiarray4 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiarray4[i][j] = rand.nextInt(50);
                System.out.print(multiarray4[i][j] + " ");
            }
            System.out.println();
        }
        int summeven = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                int element = multiarray4[i][j];
                if (element % 2 == 0) {
                    summeven += element;
                }
            }
        }
        System.out.println(summeven);
    }
}






