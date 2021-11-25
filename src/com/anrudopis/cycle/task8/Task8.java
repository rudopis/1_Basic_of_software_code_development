package com.anrudopis.cycle.task8;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {
    public static void main(String[] args) {

        double numberOne = 3462.32;
        double numberTwo = 326.9903;

        String numberOneString = String.valueOf(numberOne).replace(".", ""); //заменяем точки на пустую строку, что бы исключить их
        String numberTwoString = String.valueOf(numberTwo).replace(".", "");

        String commonDigits = "";

        for (int numberOneIndex = 0; numberOneIndex < numberOneString.length(); numberOneIndex++) {
            var currentCharacterOfNumberOne = numberOneString.charAt(numberOneIndex);
            if (numberTwoString.indexOf(currentCharacterOfNumberOne) != -1) {
                if (commonDigits.indexOf(currentCharacterOfNumberOne) == -1) {
                    commonDigits += currentCharacterOfNumberOne + " ";
                }
            }
        }

        System.out.print("Одинаковые цифры для обоих чисел: ");
        System.out.println(commonDigits);
    }
}
