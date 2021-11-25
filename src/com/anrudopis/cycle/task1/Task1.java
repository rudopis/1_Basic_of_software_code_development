package com.anrudopis.cycle.task1;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {

        int usersNumber;
        Scanner scr = new Scanner(System.in);
        System.out.println("Input positive integer:");

        usersNumber = scr.nextInt();

        scr.close();

        int result = 0;

        for (int i = 1; i <= usersNumber; i++) {
            result = result + i;
        }

        System.out.print("Result = " + result);

    }
}
