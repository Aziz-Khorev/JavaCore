package com.aziz.javacore.chapter07;

// В этой программе демонстрируется применение свойства length,
// определяющего длину массива
public class Langth {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("длина a1 равна " + a1.length);
        System.out.println("длина a1 равна " + a2.length);
        System.out.println("длина a1 равна " + a3.length);
    }
}