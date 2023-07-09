package com.aziz.javacore.chapter07;

// Аргументы переменной длины и перегрузка
public class VarTest3 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): "
                + "Колличество аргументов: "
                + v.length + " Содержимое: ");

        for(int x : v)
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
    static void vaTest(String msg, int ... v) {
        System.out.print("vaTest(String, int ... ): " +
                msg + v.length +
                " Содержимое: " );

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}
