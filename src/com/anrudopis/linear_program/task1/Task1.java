package com.anrudopis.linear_program.task1;

/*
 * Найдите  значение функции:
 * z = ( (a – 3 ) * b / 2) + c.
 */

public class Task1 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        a = 8.2;
        b = 4.0;
        c = 24.5;

        z = ((a - 3) * b / 2) + c;

        System.out.println("При значениях переменных a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Значение функции будет z = " + z);

    }
}