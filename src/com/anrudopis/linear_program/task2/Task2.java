package com.anrudopis.linear_program.task2;

/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * ((b+√(b^2+4ac))/2a) - a^3*c + b^(-2)
 */

public class Task2 {
    public static void main(String[] args) {

        double a = 4.0;
        double b = 12.2;
        double c = 7.0;
        double result;

        result = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Result: " + result);
    }
}
