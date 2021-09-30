package com.anrudopis.linear_program.task4;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double number;
        double wholePart;
        double fractionPart;
        double newNumber;

        number = 123.456;

        wholePart = Math.floor(number);
        fractionPart = Math.round(1000 * (number - wholePart));

        newNumber = fractionPart + (wholePart * 0.001);

        System.out.print("Number after replacement: " + newNumber);
    }
}
