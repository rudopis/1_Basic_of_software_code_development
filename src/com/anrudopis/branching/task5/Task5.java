package com.anrudopis.branching.task5;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 * f(x)= x^2-3x+9, если x<=3;
 * f(x)=1/(x^3+6), если x>3.
 */

public class Task5 {
    public static void main(String[] args) {

        double x;
        double function;

        x = enterFromConsole("Введите значение x >>");

        if (x <= 3) {

            function = Math.pow(x, 2) - 3 * x + 9;

        } else {

            function = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("F(x)= " + function);
    }

    public static double enterFromConsole(String message) {

        double value;

        @SuppressWarnings("resource")
        Scanner scr = new Scanner(System.in);

        System.out.println(message);

        while (!scr.hasNextDouble()) {

            scr.nextLine();
            System.out.println(message);
        }

        value = scr.nextDouble();

        return value;
    }
}
