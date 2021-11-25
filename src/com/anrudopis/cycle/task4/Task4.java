package com.anrudopis.cycle.task4;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {

        double result = 1;

        for (int i = 1; i <= 200; i++) {
            result *= i * i;
            System.out.println(result);
        }

    }
}
