package com.anrudopis.branching.task3;

import java.util.Scanner;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 *Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {

        double xA;
        double yA;
        double xB;
        double yB;
        double xC;
        double yC;

        System.out.println("Введите координаты точки A");
        xA = enterFromConsole("x >>");
        yA = enterFromConsole("y >>");

        System.out.println("Введите координаты точки B");
        xB = enterFromConsole("x >>");
        yB = enterFromConsole("y >>");

        System.out.println("Введите координаты точки C");
        xC = enterFromConsole("x >>");
        yC = enterFromConsole("y >>");

        if ((xC - xA) / (xB - xA) == (yC - yA) / (yB - yA)) {

            System.out.println("Данные точки расположены на одной прямой");

        } else {

            System.out.println("Данные точки НЕ расположены на одной прямой");
        }


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
