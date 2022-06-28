package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstLesson {
    /* Для 3 задания везде стоит int, кроме операции деления, там придумал свой double, чтобы видеть дробную часть.
       Для 2 задания числа вводятся типа Integer, ну а далее в методе уже переводятся в double
       Для 1 задания даже не знаю что добавить :).
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------#3-------");
        System.out.print("Введите 2 числа: ");
        try {
            double x = sc.nextInt();
            double y = sc.nextInt();

            System.out.println("Выберете любую операцию: + , - , * , /");

            sc.nextLine();
            String choice = sc.nextLine();


            if (choice.equals("+")) {
                System.out.println("Сумма равна: " + (int) (x + y));
            } else if (choice.equals("-")) {
                System.out.println("Разность равна: " + (int) (x - y));
            } else if (choice.equals("*")) {
                System.out.println("Произведение равно: " + (int) (x * y));
            } else if (choice.equals("/")) {
                System.out.println("Частное равно: " + (x / y));
            } else System.out.println("Данной операции нет!");
        } catch (InputMismatchException e) {
            System.out.println("Простите, но вы не ввели числа :( " + e);
        }

        System.out.println("-------#1-------");
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        numberOne(name);

        System.out.println("-------#2-------");
        System.out.println("Введите 2 числа: ");
        try {
            double a = sc.nextInt();
            double b = sc.nextInt();
            numberTwo(a, b);
        } catch (InputMismatchException e) {
            System.out.println(" Вы угараете? Написано же - числа -_- " + e);
        }
    }
    private static void numberOne(String str) {
        System.out.println("Привет, " + str);
    }
    private static void numberTwo(double a, double b) {
        System.out.println("Сумма чисел: " + (a + b));
    }
}
