package com.anrudopis.linear_program.task6;

/**
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае
 */

public class Task6 {
    public static void main(String[] args) {
        int x;
        int y;
        boolean coordinates;

        x = -3;
        y = -1;

        coordinates = ((y >= -3 && y <= 0 && x >= -4 && x <= 4) || (y >= 0 && y <= 4 && x >= -2 && x <= 2));

        System.out.println("Принадлежит ли точка выделенной области: " + coordinates);
    }
}
