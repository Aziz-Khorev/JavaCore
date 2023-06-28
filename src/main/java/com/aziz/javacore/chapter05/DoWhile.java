package com.aziz.javacore.chapter05;

// Продемонстрировать применение оператора цикла do-while
class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println(" тaкт " + n);
            n--;
        } while (n > 0);
    }
}
