package com.anrudopis.branching.task1;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {

        double angle1;
        double angle2;

        @SuppressWarnings("resource")
        Scanner scr = new Scanner(System.in);

        System.out.println("Input angle1, angle2");

        while (!scr.hasNextDouble()) {

            scr.nextLine();
            System.out.println("Input double");
        }

        angle1 = scr.nextDouble();

        while (!scr.hasNextDouble()) {

            scr.nextLine();
            System.out.println("Input double");
        }

        angle2 = scr.nextDouble();


        if ((angle1 + angle2) < 180) {

            System.out.println("Треугольник существует");

            if ((angle1 + angle2) == 90 || angle1 == 90 || angle2 == 90) {

                System.out.println("И этот треугольник прямоугольный");
            }
        } else {

            System.out.println("Треугольник с такими углами не существует");
        }

    }
}
