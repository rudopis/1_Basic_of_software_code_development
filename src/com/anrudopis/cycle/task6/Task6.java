package com.anrudopis.cycle.task6;

import java.util.Scanner;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите символы");
        String userInput = scr.nextLine();
        scr.close();

        for (int i = 0; i < userInput.length(); i++) {

            char symbol = userInput.charAt(i);
            System.out.println(symbol + "--->" + Integer.toBinaryString(symbol));

        }
    }
}
