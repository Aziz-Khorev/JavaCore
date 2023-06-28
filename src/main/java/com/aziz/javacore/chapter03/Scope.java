package com.aziz.javacore.chapter03;

// Продемонстрировать область действия блока кода
class Scope {
    public static void main(String args[]) {
        int x; // эта переменная доступна всему коду из метода lll&in ()
        x = 10;
        if (x == 10) { // начало новой области действия
            int y = 20; // доступной только этому блоку кода
// обе переменные х и у доступны в э той области действия
            System.out.println(" x и у: " + x + " " + y);
            x = y * 2;
        }
// у = 100; // ОШИБКА ! переменная y недоступна
// в этой области действия , тогда как
// переменная х доступна и эдесь
        System.out.println(" x равно " + x);
    }
}