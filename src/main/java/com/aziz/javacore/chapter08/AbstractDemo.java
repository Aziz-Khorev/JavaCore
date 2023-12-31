package com.aziz.javacore.chapter08;

// Простой пример абстракции
abstract class A7 {
    abstract void callme();

    // абстрактные классы все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B7 extends A7 {
    void callme() {
        System.out.println("Реализация метода callme() в классе B.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();

        b.callme();
        b.callmetoo();
    }
}
