package com.aziz.javacore.chapter08;

import org.w3c.dom.ls.LSOutput;

// Динамическая диспетчеризация метов
class A6 {
    void callme(){
        System.out.println("В методе callme() из класса A");
    }
}

class B6 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C2 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("B методе callme() из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();  // объект класса A
        B6 b = new B6();  // объект класса B
        C2 c = new C2();  // объект класса C

        A6 r;         // получить ссылку на объект типа A

        r = a;       // переменная r ссылается на объект типа A
        r.callme();  // вызвать вариант метода callme(),
                     // определенный в классе B
        r = c;       // переменная r ссылается на объект типа C
        r.callme();  // вызвать вариант метода callme(),
                     // определенный в классе C
    }
}
