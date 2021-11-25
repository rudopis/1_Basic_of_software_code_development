package com.anrudopis.cycle.task5;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: an=1/2^n + 1/3^n
 */

public class Task5 {
    public static void main(String[] args) {

        int n = 3;
        double e = 0.8;
        double a;
        double result = 0;

        for (int i = 1; i <= n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

            if (Math.abs(a) >= e) {
                result = result + a;
            }
        }

        System.out.println("Сумма чисел равна " + result);
    }
}
