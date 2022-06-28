package com.company;

import java.util.Scanner;

public class SecondLesson {

    public static void main(String[] args) {
        System.out.println("---------#1---------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("An even number!");
        } else {
            System.out.println("Not even number");
        }
        System.out.println("---------#2---------");
        System.out.println("Enter coordinates of the point (x; y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if ((x > 0) && (y > 0)) {
            System.out.println("Number is in the first quarter");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("Number is in the second quarter");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("Number is in the third quarter");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("Number is in the fourth quarter");
        } else System.out.println("Point is in the middle of the coordinates or on the axis x/y");
        System.out.println("---------#3---------");
        while (true) {
            System.out.println("enter 2 numbers: ");
                double o = sc.nextDouble();     // Дробная часть отделяется запятой от целой )) . Число типа 1234.23123 выкинет исключение.
                double p = sc.nextDouble();
                if (((o % 1 == 0) && (o % o == 0)) && ((p % 1 == 0) && (p % p == 0)) && (int) o != 1 && (int) p != 1) {
                    System.out.println("2 simple numbers : " + (int) o + ", " + (int) p);
                    break;
                }
        }
    }
}
