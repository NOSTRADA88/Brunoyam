package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // номер 1
//        System.out.println("Enter width and length: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        Rectangle rectangle = new Rectangle(a,b);
//        rectangle.getPerimeter();
//        rectangle.getSquare();
        // номер 2
//        System.out.println("Enter number of spoons, plates and mugs: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        System.out.print("Enter number of spoons you want: ");
//        int x1 = sc.nextInt();
//        System.out.print("Enter number of plates you want: ");
//        int y1 = sc.nextInt();
//        System.out.print("Enter number of mugs you want: ");
//        int z1 = sc.nextInt();
//        Kitchen kitchen = new Kitchen(x, y, z);
//        kitchen.getSpoons(x1);
//        kitchen.getPlates(y1);
//        kitchen.getMugs(z1);
//        kitchen.getSpoonsBack(); используем методы если поля возвращаемых вещей != 0 и мы не взяли больше доступного количества предметов
//        kitchen.getPlatesBack();
//        kitchen.getMugsBack();
        // номер 3
        try {
            MasControl masControl = new MasControl();
            System.out.print("Set massive size: ");
            int size = sc.nextInt();
            masControl.setSize(size);
            masControl.length();
            masControl.setRandomValue();
            masControl.add(0);
            masControl.remove();
            masControl.viewElements();
            masControl.remove();
            masControl.viewElements();
            masControl.length();
        } catch (NullPointerException e) {
            System.out.println("Length of a massive 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get this element!");
        } catch (InputMismatchException e) {
            System.out.println("This massive contains only numbers :( ");
        }
    }
}
