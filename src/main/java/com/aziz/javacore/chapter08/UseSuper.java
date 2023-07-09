package com.aziz.javacore.chapter08;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A2 {
    int i;
}

// создать подкласс путем расширения класс A

class B2 extends A2 {
    int i;       // этот член i скрывает член i из класса A

    B2(int a, int b) {
        super.i = a;   // член i из класса A
        i = b;         // член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2);

        subOb.show();
    }
}
