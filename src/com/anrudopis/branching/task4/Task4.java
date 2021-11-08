package com.anrudopis.branching.task4;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {
    public static void main(String[] args) {

        int x = 16;
        int y = 10;
        int z = 22;

        int length = 17;
        int width = 12;

        if ((x <= length) && (y <= width)) {

            System.out.println("Кирпич пройдет через отверстие");

        } else {

            System.out.println("Кирпич не пройдёт через отверстие");
        }

    }
}
