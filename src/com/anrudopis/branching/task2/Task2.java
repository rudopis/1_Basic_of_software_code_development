package com.anrudopis.branching.task2;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
    public static void main(String[] args) {

        double a = 2.56;
        double b = -33.7;
        double c = 100;
        double d = 0.267;

        double minFirst;
        double minSecond;

        //я знаю о методе Math.min() и Math.max(), но всё же задача на ветвление

        minFirst = a < b ? a : b;
        minSecond = c < d ? c : d;

        if (minFirst > minSecond || minFirst == minSecond) {
            System.out.println("max = " + minFirst);
        } else {
            System.out.println("max = " + minSecond);
        }

    }
}
