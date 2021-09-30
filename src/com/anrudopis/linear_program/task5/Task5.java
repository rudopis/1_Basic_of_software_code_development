package com.anrudopis.linear_program.task5;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {
        int t;
        int seconds;
        int minutes;
        int hours;

        t = 4000;

        hours = t / 3600;
        minutes = t % 3600 / 60;
        seconds = t % 3600 % 60;


        Time time = new Time(hours, minutes, seconds);
        DateFormat timeFormatter = new SimpleDateFormat("HHч mmмин ssсек");
        String strTime = timeFormatter.format(time);
        System.out.println(strTime);

    }
}
