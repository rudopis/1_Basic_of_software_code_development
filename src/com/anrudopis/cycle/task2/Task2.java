package com.anrudopis.cycle.task2;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * если x>2, то y=x
 * если x<=2, то y=-x
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double function;
        double a;
        double b;
        double h;
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите значения координат отрезка a,b и величину шага h");
        a = scr.nextDouble();
        b = scr.nextDouble();
        h = scr.nextDouble();

        scr.close();

        for (double i = a; i <= b; i = i + h) {

            if (i <= 2) {
                function = (-i);
            } else {
                function = i;
            }
            System.out.println("y(" + i + ") = " + function);
        }

    }
}
