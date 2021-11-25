package com.anrudopis.cycle.task7;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class Task7 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите числа m, n");
        int numberM = scr.nextInt();
        int numberN = scr.nextInt();
        scr.close();

        int currentNaturalNumber = numberM;

        while (currentNaturalNumber <= numberN) {

            for (int i = 1; i <= currentNaturalNumber; i++) {

                if (currentNaturalNumber % i == 0 && i != 1 && i != currentNaturalNumber) {
                    System.out.println("Делитель числа " + currentNaturalNumber + ": " + i);
                }

            }

            currentNaturalNumber++;
        }
    }
}

