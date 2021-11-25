package com.anrudopis.cycle.task3;

//Найти сумму квадратов первых ста чисел.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите начало отсчёта");
        double firstNumber = scr.nextDouble();

        scr.close();

        double result = 0;

        for (double i = firstNumber; i <= (firstNumber + 99); i++) {
            result = result + Math.pow(i, 2);
        }

        System.out.println("Результат суммы квадратов первых 100 чисел: " + result);

    }
}
