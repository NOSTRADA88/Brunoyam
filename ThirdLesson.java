package com.company;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Номер 1
//    int n = sc.nextInt();
//    int product = 1;
//    for (int i = 1; i <= n; i++) {
//        product *= i ;
//    }
//        System.out.println(product);
        // номер 2
//    int[] mas = new int[90];
//    mas[0] = 0;
//    mas[1] = 1;
//    for (int i = 2; i < mas.length; i++) {
//        mas[i] = mas[i-1] + mas[i-2];
//        System.out.print(mas[i] + " ");
//    }
        // номер 3
        System.out.println("Enter your String, to check lowercase letters: ");
        String str = sc.nextLine();
            boolean result = false;
            char[] newStr = str.toCharArray();
            for (char letter : newStr) {
                if (Character.isLowerCase(letter) && str.matches("[a-z]*")) {
                    result = true;
                }
            }
        System.out.println("it's " + result);
            sc.close();
    }
}


