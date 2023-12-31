package com.aziz.javacore.chapter09;

// Один интерфейс может расширить другой
interface A2 {
    void meth1();
    void meth2();
}

// Теперь интерфейс B включает в себя методы meth1()
// и meth2() и добавляет meth3()
interface B2 extends A2 {
    void meth3();
}

// этот класс должен реализовать все методы из интерфейса A и B
class MyClass implements B2 {
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
