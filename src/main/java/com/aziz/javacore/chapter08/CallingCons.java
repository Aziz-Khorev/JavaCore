package com.aziz.javacore.chapter08;

// Продемонстрировать порядок вызова конструкторов

// создать супер класс

class A3 {
    A3() {
        System.out.println("B конструкторе A.");
    }
}

// создать подкласс путем расширения класса A
class B3 extends A3 {
    B3() {
        System.out.println("B конструкторе B.");
    }
}
// создать еще один подкласс путем расширения класс B
class C extends B3 {
    C() {
        System.out.println("В конструкторе C.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
