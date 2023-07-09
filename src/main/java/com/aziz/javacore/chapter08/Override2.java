package com.aziz.javacore.chapter08;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A5 {
    int i, j;
    A5(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса A
class B5 extends A5 {
    int k;
    B5(int a, int b, int c) {
        super (a, b);
        k = c;
    }
    // перегрузить метод super()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);

        subOb.show("Это k: ");  // вызвать метод show() из класса B
        subOb.show();           // вызвать метод show() из класса A
    }
}
