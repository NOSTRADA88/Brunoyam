package com.company;

import java.util.Arrays;

public class MasControl {
    protected int[] a;
    public void setSize(int size) {
        System.out.println("Entered size of a massive: " + size);
        for (int i = 0; i != size; i++) {
            this.a = new int[i];    // задаёт размер массива
        }
    }
    public void setRandomValue() {
        for(int i = 0; i < a.length; i++) {
            a[i] = ((int) (Math.random() * 101) - 50); // заполняет ячейки случайными числами
        }
    }
    public void length() {
        if (a.length > 0) {
                System.out.println("Massive length at the moment: " + (a.length));
        } else System.out.println("Massive length 0! "); // выводит длину массива
    }
    public void add(int something){
        a = Arrays.copyOf(a, a.length + 1);
        if (a.length > 0) {
            a[a.length - 1] = something;
        } else System.out.println("Can't add element"); // добавляет элемент в конец массива
    }
    public void get (int i) {
        if (a.length > 0) {
            System.out.println("Element: " + a[i] + " , by index " + i ); // выводит элемент по выбранному индексу, если такой индекс есть в массиве
        }
    }
    public void remove () {
        if (a.length > 0) {
            a = Arrays.copyOf(a, a.length - 1); // удаляет последний элемент в конце массива
        }
    }
    public void viewElements() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // выводит элементы массива
        }
    }
}
