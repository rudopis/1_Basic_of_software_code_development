package com.anrudopis.linear_program.task3;

/**
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 * ((𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦))*𝑡𝑔 𝑥𝑦
 */

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;
        double result;

        x = 30.0;
        y = 60.0;
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("Результат: " + result);
    }
}
