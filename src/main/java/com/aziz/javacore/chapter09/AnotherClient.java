/*
package com.aziz.javacore.chapter09;

public class AnotherClient implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Еще один вариант метода()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;  // теперь переменная c ссылается на объект типа AnotherClient
        c.callback(42);
    }
}
*/