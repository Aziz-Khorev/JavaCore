/*
package com.aziz.javacore.chapter07;


// Аргументы переменной длины и перегрузка, перегрузка и неоднозначность.
// Эта программа содержит ошибку, и поэтому она не подлежит компеляции!
public class VarArgs4 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): "
                + "Колличество аргументов: "
                + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) "
                + "Колличество аргументов: "
                + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1, 2, 3);             // Верно!
        vaTest(true, false, false);  // Верно!
        vaTest();                       // Ошибка: неоднозначность!
    }
}
*/